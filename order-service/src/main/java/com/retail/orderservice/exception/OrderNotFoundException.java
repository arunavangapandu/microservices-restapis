package com.retail.orderservice.exception;

import com.retail.orderservice.domain.Order;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(String message){
        super(message);
    }
}
