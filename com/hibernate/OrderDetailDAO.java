package com.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hibernate.model.OrderDetail;

/**
 * A data access object (DAO) providing persistence and search support for
 * OrderDetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hibernate.model.OrderDetail
 * @author MyEclipse Persistence Tools
 */

public class OrderDetailDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(OrderDetailDAO.class);
	// property constants
	public static final String NUMBER = "number";
	public static final String COMMENTS = "comments";

	public void save(OrderDetail transientInstance) {
		log.debug("saving OrderDetail instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OrderDetail persistentInstance) {
		log.debug("deleting OrderDetail instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OrderDetail findById(com.hibernate.model.OrderDetailId id) {
		log.debug("getting OrderDetail instance with id: " + id);
		try {
			OrderDetail instance = (OrderDetail) getSession().get(
					"com.hibernate.OrderDetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(OrderDetail instance) {
		log.debug("finding OrderDetail instance by example");
		try {
			List results = getSession()
					.createCriteria("com.hibernate.OrderDetail")
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
		log.debug("finding OrderDetail instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from OrderDetail as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNumber(Object number) {
		return findByProperty(NUMBER, number);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findAll() {
		log.debug("finding all OrderDetail instances");
		try {
			String queryString = "from OrderDetail";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public OrderDetail merge(OrderDetail detachedInstance) {
		log.debug("merging OrderDetail instance");
		try {
			OrderDetail result = (OrderDetail) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(OrderDetail instance) {
		log.debug("attaching dirty OrderDetail instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OrderDetail instance) {
		log.debug("attaching clean OrderDetail instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}