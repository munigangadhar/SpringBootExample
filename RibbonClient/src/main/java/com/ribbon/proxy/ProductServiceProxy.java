package com.ribbon.proxy;

import java.util.Collection;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="productService",url="http://localhost:8091/products")
@RibbonClient(name = "productService")
public interface ProductServiceProxy {

	@GetMapping(value= "/fetchAllProduct")
	public Collection<Object> fetchAll();
}
