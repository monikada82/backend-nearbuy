package com.nearbuy.backend.dto.cart;

import lombok.Data;

@Data
public class CartRequest {
    private Long productId;
    private int quantity;
}
