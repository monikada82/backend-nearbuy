package com.nearbuy.backend.controller;

import com.nearbuy.backend.dto.product.ProductRequest;
import com.nearbuy.backend.dto.product.ProductResponse;
import com.nearbuy.backend.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    public final ProductService productService;

    @PostMapping
    public ProductResponse addProduct(@RequestBody ProductRequest request){
        return productService.addProduct(request);
    }

    @GetMapping("/search")
    public Page<ProductResponse> getProducts(
            @RequestParam(defaultValue = "") String keyword,
            @RequestParam(defaultValue = "0") double min,
            @RequestParam(defaultValue = "1000000") double max,
            Pageable pageable) {

        return productService.getProducts(keyword, min, max, pageable);
    }

    @GetMapping("/filter")
    public Page<ProductResponse>filterByPrice(
                @RequestParam double min,
                @RequestParam double max,
                Pageable pageable
                ){
            return productService.filterProductsByPrice(min,max,pageable);
        }
    }

