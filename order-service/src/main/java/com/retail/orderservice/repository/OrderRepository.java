package com.retail.orderservice.repository;// OrderRepository.java (Repository Layer)
import com.retail.orderservice.domain.Order;

import java.util.List;

public interface OrderRepository {
    Order save(Order order);
    Order findById(Long id);
    List<Order> findAll();
    void deleteById(Long id);
}
