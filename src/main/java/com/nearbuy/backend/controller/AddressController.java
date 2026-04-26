package com.nearbuy.backend.controller;

import com.nearbuy.backend.dto.address.AddressRequest;
import com.nearbuy.backend.dto.address.AddressResponse;
import com.nearbuy.backend.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping("/{userId}")
    public AddressResponse addAddress(
            @PathVariable Long userId,
            @RequestBody AddressRequest request) {

        return addressService.addAddress(userId, request);
    }

    @GetMapping("/{userId}")
    public List<AddressResponse> getAddresses(@PathVariable Long userId) {
        return addressService.getUserAddresses(userId);
    }
}
