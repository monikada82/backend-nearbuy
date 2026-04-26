package com.nearbuy.backend.dto.product;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ProductRequest {

    @NotBlank(message = "Product name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;

    @Positive(message = "Price must be greater than 0")
    private double price;

    @PositiveOrZero(message = "Stock cannot be negative")
    private int stock;

    @NotNull(message = "Category ID is required")
    private Long categoryId;
}