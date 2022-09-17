package com.example.maninstore.dto.product;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

import java.util.List;

@Data
public class ProductDetailDto {

//    private String thumbnail;
//    private String detailImg;
    private String name;
    private int price;
    private int discountRate;
    private String summary;
    private List<ProductOptionDto> productOption;

    @QueryProjection
    public ProductDetailDto(String name, int price, int discountRate, String summary, List<ProductOptionDto> productOption) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.summary = summary;
        this.productOption = productOption;
    }
}
