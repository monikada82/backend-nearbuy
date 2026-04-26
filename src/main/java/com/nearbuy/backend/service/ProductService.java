package com.nearbuy.backend.service;

import com.nearbuy.backend.dto.product.ProductRequest;
import com.nearbuy.backend.dto.product.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductResponse addProduct(ProductRequest request);

    Page<ProductResponse> getProducts(String keyword,double min,double max,Pageable pageable);

    Page<ProductResponse> searchProducts(String keyword, Pageable pageable);

    Page<ProductResponse> filterProductsByPrice(double min, double max, Pageable pageable);


}