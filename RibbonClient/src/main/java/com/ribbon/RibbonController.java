package com.ribbon;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ribbon.proxy.OrderDetailServiceProxy;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

	@Autowired
	private OrderDetailServiceProxy orderProxy;
	
	@GetMapping("/findAllOrders")
	public Collection<Object> findAllOrders()
	{
		return orderProxy.fetchAll();
	}
     
}
