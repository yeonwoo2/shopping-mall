package com.example.maninstore.dto.product;

import lombok.Data;

import java.util.List;

@Data
public class ProductOrderCondition {

    private Long product_id;
    private List<ProductOptionDto> productOption;

}
