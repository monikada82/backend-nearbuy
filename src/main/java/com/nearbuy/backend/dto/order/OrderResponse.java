package com.nearbuy.backend.dto.order;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OrderResponse {
    private Long orderId;
    private List<String> products;
    private double totalAmount;
    private String status;
    private String address;
}