package com.nearbuy.backend.service;

import com.nearbuy.backend.dto.auth.AuthResponse;
import com.nearbuy.backend.dto.auth.LoginRequest;
import com.nearbuy.backend.dto.auth.RegisterRequest;

public interface UserService {
    String register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}
