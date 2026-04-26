package com.nearbuy.backend.service;

import com.nearbuy.backend.dto.order.OrderResponse;

import java.util.List;

public interface OrderService {

    OrderResponse checkout(Long userId,Long addressId);

    List<OrderResponse> getUserOrders(Long userId);

    OrderResponse updateStatus(Long orderId, String status);
}