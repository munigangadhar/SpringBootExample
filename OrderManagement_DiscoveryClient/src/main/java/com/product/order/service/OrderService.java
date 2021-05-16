package com.product.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.order.dao.OrderDAO;
import com.product.order.domain.OrderDetails;

@Service
public class OrderService {
	
	private final OrderDAO orderDAO;
	
	@Autowired
	public OrderService(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	public List<OrderDetails> findAllOrders() {
		return orderDAO.findAll();
	}


}
