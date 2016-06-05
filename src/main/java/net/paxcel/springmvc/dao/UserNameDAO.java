package net.paxcel.springmvc.dao;

import java.util.List;

import net.paxcel.springmvc.session1.entity.UserName;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserNameDAO extends BaseDAO {
	
	@Autowired
	@Qualifier("db1SessionFactory")
	SessionFactory db1SessionFactory;
	
	@Override
	public Session getCurrentSession() {
		return db1SessionFactory.getCurrentSession();
	}	

	public List<UserName> getUserNameListFromSessionFactory1() {
		return listAll(UserName.class);
	}

}
