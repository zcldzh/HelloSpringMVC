package net.paxcel.springmvc.service;

import java.util.List;

import net.paxcel.springmvc.dao.OrderDetailsDAO;
import net.paxcel.springmvc.dao.UserNameDAO;
import net.paxcel.springmvc.session1.entity.UserName;
import net.paxcel.springmvc.session2.entity.OrderDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	UserNameDAO userNameDAO;
	
	@Autowired
	OrderDetailsDAO orderDetailsDAO;
	
	
	@Override
	@Transactional("db1TransactionManager")
	public List<UserName> getUserNameListFromSessionFactory1() {
		return userNameDAO.getUserNameListFromSessionFactory1();
	}
	
	@Override
	@Transactional("db2TransactionManager")
	public List<OrderDetails> getOrderDetailsListFromSessionFactory2() {
		return orderDetailsDAO.getOrderDetailsListFromSessionFactory2();
	}
}
