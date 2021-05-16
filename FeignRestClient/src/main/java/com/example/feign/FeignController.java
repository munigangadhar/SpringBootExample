package com.example.feign;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.proxy.OrderServiceProxy;
import com.example.feign.proxy.ProductServiceProxy;

@RestController
@RequestMapping("/Feign")
public class FeignController {
	
	@Autowired
	ProductServiceProxy productproxy;

	@Autowired
	OrderServiceProxy orderProxy;
	
	@GetMapping("/findAllProducts")
	public Collection<Object> findAllProducts()
	{
		return productproxy.fetchAll();
	}
	
	@GetMapping("/findAllOrders")
	public Collection<Object> findAllOrders()
	{
		return orderProxy.fetchAll();
	}
     
}
