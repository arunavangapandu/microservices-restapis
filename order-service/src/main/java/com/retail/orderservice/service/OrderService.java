package com.retail.orderservice.service;// OrderService.java (Service Layer)
import com.retail.orderservice.domain.Order;
import com.retail.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(List<String> items) {
        Order order = new Order(null, items); // ID will be generated by the repository
        return orderRepository.save(order);
    }

    public Order getOrder(Long id) {
        return orderRepository.findById(id);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order updateOrder(Long id, List<String> items) {
        Order existingOrder = orderRepository.findById(id);
        if (existingOrder != null) {
            existingOrder.setItems(items);
            return orderRepository.save(existingOrder);
        }
        return null; // Or throw an exception indicating order not found
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
