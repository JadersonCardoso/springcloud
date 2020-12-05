package com.devsuperior.hrpayroll.services;

import com.devsuperior.hrpayroll.entetities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPaymente(Long workerId, int days){
        return new Payment("Bob", 200.0, days);
    }
}
