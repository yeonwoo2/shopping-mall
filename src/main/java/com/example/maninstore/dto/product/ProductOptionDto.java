package com.example.maninstore.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductOptionDto {
    private String size;
    private String color;
    private int stockQuantity;
}
