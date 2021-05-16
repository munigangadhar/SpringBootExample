package com.product.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.order.domain.OrderDetails;

public interface OrderDAO extends JpaRepository<OrderDetails, Long>{

}
