package com.nearbuy.backend.controller;

import com.nearbuy.backend.dto.order.OrderRequest;
import com.nearbuy.backend.dto.order.OrderResponse;
import com.nearbuy.backend.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    //Checkout
    @PostMapping("/checkout/{userId}")
    public OrderResponse checkout(
            @PathVariable Long userId,
            @RequestBody OrderRequest request) {

        return orderService.checkout(userId, request.getAddressId());
    }

    //Get user orders
    @GetMapping("/{userId}")
    public List<OrderResponse> getOrders(@PathVariable Long userId) {
        return orderService.getUserOrders(userId);


    }
}