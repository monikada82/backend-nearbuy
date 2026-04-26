package com.nearbuy.backend.service.impl;

import com.nearbuy.backend.dto.payment.PaymentResponse;
import com.nearbuy.backend.entity.Order;
import com.nearbuy.backend.entity.Payment;
import com.nearbuy.backend.enums.PaymentStatus;
import com.nearbuy.backend.exception.ResourceNotFoundException;
import com.nearbuy.backend.repository.OrderRepository;
import com.nearbuy.backend.repository.PaymentRepository;
import com.nearbuy.backend.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;

    @Override
    public PaymentResponse makePayment(Long orderId) {


        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found"));


        Payment payment = Payment.builder()
                .orderId(orderId)
                .amount(order.getTotalAmount())
                .status(PaymentStatus.SUCCESS) // mock success
                .build();

        Payment saved = paymentRepository.save(payment);

        return mapToResponse(saved);
    }

    private PaymentResponse mapToResponse(Payment p) {
        return PaymentResponse.builder()
                .paymentId(p.getId())
                .orderId(p.getOrderId())
                .amount(p.getAmount())
                .status(p.getStatus().name())
                .build();
    }
}