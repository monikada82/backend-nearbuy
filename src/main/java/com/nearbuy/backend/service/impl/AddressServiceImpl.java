package com.nearbuy.backend.service.impl;

import com.nearbuy.backend.dto.address.AddressRequest;
import com.nearbuy.backend.dto.address.AddressResponse;
import com.nearbuy.backend.entity.Address;
import com.nearbuy.backend.repository.AddressRepository;
import com.nearbuy.backend.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public AddressResponse addAddress(Long userId, AddressRequest request) {

        Address address = Address.builder()
                .userId(userId)
                .street(request.getStreet())
                .city(request.getCity())
                .state(request.getState())
                .zipCode(request.getZipCode())
                .country(request.getCountry())
                .build();

        Address saved = addressRepository.save(address);

        return mapToResponse(saved);
    }

    @Override
    public List<AddressResponse> getUserAddresses(Long userId) {

        return addressRepository.findByUserId(userId)
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    private AddressResponse mapToResponse(Address a) {
        return AddressResponse.builder()
                .id(a.getId())
                .street(a.getStreet())
                .city(a.getCity())
                .state(a.getState())
                .zipCode(a.getZipCode())
                .country(a.getCountry())
                .build();
    }
}
