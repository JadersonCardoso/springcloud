package com.devsuperior.hrpayroll.resources;

import com.devsuperior.hrpayroll.entetities.Payment;
import com.devsuperior.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
    
    @Autowired
    private PaymentService service;
    
    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPaymente(@PathVariable Long workerId, @PathVariable Integer days){
        var payment = this.service.getPaymente(workerId, days);
        return ResponseEntity.ok(payment);
    }

    
}
