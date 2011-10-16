package com.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hibernate.model.Table;

/**
 * A data access object (DAO) providing persistence and search support for Table
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.hibernate.model.Table
 * @author MyEclipse Persistence Tools
 */

public class TableDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TableDAO.class);
	// property constants
	public static final String TABLE_STATUS = "tableStatus";

	public void save(Table transientInstance) {
		log.debug("saving Table instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Table persistentInstance) {
		log.debug("deleting Table instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Table findById(java.lang.Integer id) {
		log.debug("getting Table instance with id: " + id);
		try {
			Table instance = (Table) getSession()
					.get("com.hibernate.Table", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Table instance) {
		log.debug("finding Table instance by example");
		try {
			List results = getSession().createCriteria("com.hibernate.Table")
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
		log.debug("finding Table instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Table as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTableStatus(Object tableStatus) {
		return findByProperty(TABLE_STATUS, tableStatus);
	}

	public List findAll() {
		log.debug("finding all Table instances");
		try {
			String queryString = "from Table";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Table merge(Table detachedInstance) {
		log.debug("merging Table instance");
		try {
			Table result = (Table) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Table instance) {
		log.debug("attaching dirty Table instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Table instance) {
		log.debug("attaching clean Table instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}