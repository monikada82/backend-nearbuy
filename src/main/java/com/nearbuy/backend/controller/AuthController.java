package com.nearbuy.backend.controller;

import com.nearbuy.backend.dto.auth.AuthResponse;
import com.nearbuy.backend.dto.auth.LoginRequest;
import com.nearbuy.backend.dto.auth.RegisterRequest;
import com.nearbuy.backend.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request){
        return userService.register(request);
    }
    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request){
        return userService.login(request);
    }
}
