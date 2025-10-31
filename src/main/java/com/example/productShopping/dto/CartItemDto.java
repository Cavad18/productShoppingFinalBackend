package com.example.productShopping.dto;

import lombok.Data;

@Data
public class CartItemDto {
    private Long id;
    private Long productId;
    private String brand;
    private String model;
    private String category;
    private String description;
    private double price;
    private int rate;
    private String imageUrl;
    private Integer quantity;
}
