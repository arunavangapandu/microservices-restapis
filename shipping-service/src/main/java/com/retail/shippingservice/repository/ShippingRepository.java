package com.retail.shippingservice.repository;

import com.retail.shippingservice.domain.Shipment;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ShippingRepository {
    private Map<String, Shipment> shipments = new HashMap<>();

    public Shipment save(Shipment shipment) {
        shipments.put(shipment.getOrderId(), shipment);
        return shipments.get(shipment.getOrderId());
    }

    public Shipment findByOrderId(String orderId) {
        return shipments.get(orderId);
    }

}