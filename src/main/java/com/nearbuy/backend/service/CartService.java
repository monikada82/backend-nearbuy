package com.nearbuy.backend.service;

import com.nearbuy.backend.dto.cart.CartRequest;
import com.nearbuy.backend.dto.cart.CartResponse;
import com.nearbuy.backend.entity.Cart;

public interface CartService {
    CartResponse addToCart(Long userId, CartRequest request);
    CartResponse getCart(Long userId);
    void removeFromCart(Long userId, Long cartItemId);
}
