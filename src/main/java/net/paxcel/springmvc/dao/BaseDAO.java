package net.paxcel.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("baseDAO")
public class BaseDAO {
	protected Log logger = LogFactory.getLog(this.getClass());	
	
	@Autowired
	@Qualifier("db1SessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public void save(Object entity) {
		getCurrentSession().save(entity);
	}	
	
	public void update(Object entity) {
		getCurrentSession().update(entity);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> List<T> listAll(Class<T> clazz)
	{
		List<T> allrows = getCurrentSession().createQuery("from " + clazz.getName() + " model ").list();
		if (allrows == null)
			allrows = ListUtils.typedList(new ArrayList(), clazz);
		
		return allrows;
	}

}
