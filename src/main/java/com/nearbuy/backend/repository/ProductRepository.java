package com.nearbuy.backend.repository;

import com.nearbuy.backend.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Page<Product>findByNameContainingIgnoreCase(String name, Pageable pageable);
    //name or keyword
    Page<Product>findByPriceBetween(double min, double max,Pageable pageable);
    Page<Product>findByNameContainingIgnoreCaseAndPriceBetween(String name,
                                                               double min,
                                                               double max,
                                                               Pageable pageable);
}
