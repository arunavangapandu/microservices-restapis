package com.retail.shippingservice.web;

import com.retail.shippingservice.domain.Shipment;
import com.retail.shippingservice.service.ShippingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @PostMapping("/create")
    public ResponseEntity<Shipment> createShipment(@RequestBody Shipment shipment) {
        Shipment shipmentCreated = shippingService.createShipment(shipment);
        return new ResponseEntity<>(shipmentCreated, HttpStatus.CREATED);
    }

    @GetMapping("/status/{orderId}")
    public ResponseEntity<String> getShipmentStatus(@PathVariable String orderId) {
        String status = shippingService.getShipmentStatus(orderId);
        return (status != null) ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
