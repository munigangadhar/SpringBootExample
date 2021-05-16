package com.example.feign.proxy;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="orderService",url="http://localhost:8092/orders")
public interface OrderServiceProxy {

	@GetMapping(value= "/fetchAllOrders")
	public Collection<Object> fetchAll();

}
