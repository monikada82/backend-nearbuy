package com.nearbuy.backend.service;

import com.nearbuy.backend.dto.address.AddressRequest;
import com.nearbuy.backend.dto.address.AddressResponse;

import java.util.List;

public interface AddressService {

    AddressResponse addAddress(Long userId, AddressRequest request);

    List<AddressResponse> getUserAddresses(Long userId);
}
