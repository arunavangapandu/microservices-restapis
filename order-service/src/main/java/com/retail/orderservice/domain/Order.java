package com.retail.orderservice.domain;

import java.util.List;

public class Order {

    private Long id;

    private List<String> items;

    public Order(Long id, List<String> items) {
        this.id = id;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}