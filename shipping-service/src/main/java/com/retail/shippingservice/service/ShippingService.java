package com.retail.shippingservice.service;

import com.retail.shippingservice.domain.Shipment;
import com.retail.shippingservice.repository.ShippingRepository;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private final ShippingRepository shippingRepository;

    public ShippingService(ShippingRepository shippingRepository) {
        this.shippingRepository = shippingRepository;
    }

    public Shipment createShipment(Shipment shipment) {
        return  shippingRepository.save(shipment);
    }

    public String getShipmentStatus(String orderId) {
        Shipment shipment = shippingRepository.findByOrderId(orderId);
        return (shipment != null) ? shipment.getStatus() : null;
    }
}
