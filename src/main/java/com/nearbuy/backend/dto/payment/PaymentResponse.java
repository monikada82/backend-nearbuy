package com.nearbuy.backend.dto.payment;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentResponse {

    private Long paymentId;
    private Long orderId;
    private double amount;
    private String status;
}