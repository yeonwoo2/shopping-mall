package com.example.maninstore.controller.dto.product;

import lombok.Data;

import java.util.List;

@Data
public class ProductDetailDto {

    private String productId;
//    private String thumbnail;
//    private String detailImg;
    private String name;
    private int price;
    private int discountRate;
    private String summary;
    private List<ProductOptionDto> productDetail;
}
