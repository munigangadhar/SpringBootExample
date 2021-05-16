package com.example.feign.proxy;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="productService",url="http://localhost:8091/products")
public interface ProductServiceProxy {

	@GetMapping(value= "/fetchAllProduct")
	public Collection<Object> fetchAll();
}
