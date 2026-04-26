package com.nearbuy.backend.controller;

import com.nearbuy.backend.dto.payment.PaymentResponse;
import com.nearbuy.backend.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/{orderId}")
    public PaymentResponse makePayment(@PathVariable Long orderId) {
        return paymentService.makePayment(orderId);
    }
}