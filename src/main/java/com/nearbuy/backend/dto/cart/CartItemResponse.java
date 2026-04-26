package com.nearbuy.backend.dto.cart;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartItemResponse {

    private String productName;
    private int quantity;
    private double price;
}
