package com.hibernate;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hibernate.model.Food;

/**
 * A data access object (DAO) providing persistence and search support for Food
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.hibernate.model.Food
 * @author MyEclipse Persistence Tools
 */

public class FoodDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(FoodDAO.class);
	// property constants
	public static final String FOOD_CNAME = "foodCname";
	public static final String FOOD_ENAME = "foodEname";
	public static final String FOOD_PRICE = "foodPrice";
	public static final String FOOD_DISCOUNT = "foodDiscount";
	public static final String FOOD_CDESCRIPTION = "foodCdescription";
	public static final String FOOD_EDESCRIPTION = "foodEdescription";

	public void save(Food transientInstance) {
		log.debug("saving Food instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Food persistentInstance) {
		log.debug("deleting Food instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Food findById(java.lang.Integer id) {
		log.debug("getting Food instance with id: " + id);
		try {
			Food instance = (Food) getSession().get("com.hibernate.Food", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Food instance) {
		log.debug("finding Food instance by example");
		try {
			List results = getSession().createCriteria("com.hibernate.Food")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Food instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Food as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFoodCname(Object foodCname) {
		return findByProperty(FOOD_CNAME, foodCname);
	}

	public List findByFoodEname(Object foodEname) {
		return findByProperty(FOOD_ENAME, foodEname);
	}

	public List findByFoodPrice(Object foodPrice) {
		return findByProperty(FOOD_PRICE, foodPrice);
	}

	public List findByFoodDiscount(Object foodDiscount) {
		return findByProperty(FOOD_DISCOUNT, foodDiscount);
	}

	public List findByFoodCdescription(Object foodCdescription) {
		return findByProperty(FOOD_CDESCRIPTION, foodCdescription);
	}

	public List findByFoodEdescription(Object foodEdescription) {
		return findByProperty(FOOD_EDESCRIPTION, foodEdescription);
	}

	public List findAll() {
		log.debug("finding all Food instances");
		try {
			String queryString = "from Food";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Food merge(Food detachedInstance) {
		log.debug("merging Food instance");
		try {
			Food result = (Food) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Food instance) {
		log.debug("attaching dirty Food instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Food instance) {
		log.debug("attaching clean Food instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}