package com.retail.shippingservice.exception;

public class ShipmentNotFoundException extends RuntimeException {

    public ShipmentNotFoundException(String message){
        super(message);
    }
}
