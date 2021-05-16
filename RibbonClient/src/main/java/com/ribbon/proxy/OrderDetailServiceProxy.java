package com.ribbon.proxy;

import java.util.Collection;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name="orderService") 
@RibbonClient(name="orderService")
public interface OrderDetailServiceProxy {

	@GetMapping(value= "/fetchAllOrders")
	public Collection<Object> fetchAll();

}
