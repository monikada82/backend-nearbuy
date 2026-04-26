package com.nearbuy.backend.controller;

import com.nearbuy.backend.dto.cart.CartRequest;
import com.nearbuy.backend.dto.cart.CartResponse;
import com.nearbuy.backend.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;


    @PostMapping("/{userId}")
    public CartResponse addToCart(
            @PathVariable Long userId,
            @RequestBody CartRequest request) {

        return cartService.addToCart(userId, request);
    }


    @GetMapping("/{userId}")
    public CartResponse getCart(@PathVariable Long userId) {
        return cartService.getCart(userId);
    }


    @DeleteMapping("/{userId}/{itemId}")
    public void removeFromCart(
            @PathVariable Long userId,
            @PathVariable Long itemId) {

        cartService.removeFromCart(userId, itemId);
    }
}
