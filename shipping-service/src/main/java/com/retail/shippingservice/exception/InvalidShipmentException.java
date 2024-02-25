package com.retail.shippingservice.exception;

import org.springframework.stereotype.Repository;

public class InvalidShipmentException extends RuntimeException {

    public InvalidShipmentException(String message){
        super(message);
    }
}
