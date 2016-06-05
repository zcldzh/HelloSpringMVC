package net.paxcel.springmvc.dao;

import java.util.List;

import net.paxcel.springmvc.session2.entity.OrderDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDetailsDAO extends BaseDAO {
	
	@Autowired
	@Qualifier("db2SessionFactory")
	SessionFactory db2SessionFactory;
	
	@Override
	public Session getCurrentSession() {
		return db2SessionFactory.getCurrentSession();
	}

	public List<OrderDetails> getOrderDetailsListFromSessionFactory2() {
		return listAll(OrderDetails.class);		
	}
	
	

}
