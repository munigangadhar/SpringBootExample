package com.product.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.order.domain.OrderDetails;
import com.product.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping(path = "/fetchAllOrders",  produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderDetails findAllOrders()
	{
		return new OrderDetails();
	}

}
