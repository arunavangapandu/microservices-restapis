package com.retail.orderservice.repository;// InMemoryOrderRepository.java (Repository Layer Implementation)
import com.retail.orderservice.domain.Order;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryOrderRepository implements OrderRepository {
    private Map<Long, Order> orders = new HashMap<>();
    private Long orderIdCounter = 1L;

    @Override
    public Order save(Order order) {
        order.setId(orderIdCounter++);
        orders.put(order.getId(), order);
        return order;
    }

    @Override
    public Order findById(Long id) {
        return orders.get(id);
    }

    @Override
    public List<Order> findAll() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public void deleteById(Long id) {
        orders.remove(id);
    }
}
