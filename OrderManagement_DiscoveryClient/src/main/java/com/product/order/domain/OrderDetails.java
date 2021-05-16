package com.product.order.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String productName;
	private String orderId;
	private String order_quantity;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(String order_quantity) {
		this.order_quantity = order_quantity;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", productName=" + productName + ", orderId=" + orderId + ", order_quantity="
				+ order_quantity + "]";
	}
	

}
