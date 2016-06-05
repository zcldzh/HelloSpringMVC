package net.paxcel.springmvc.service;

import java.util.List;

import net.paxcel.springmvc.session1.entity.UserName;
import net.paxcel.springmvc.session2.entity.OrderDetails;

public interface MyService {
	List<UserName> getUserNameListFromSessionFactory1();
	List<OrderDetails> getOrderDetailsListFromSessionFactory2();
}
