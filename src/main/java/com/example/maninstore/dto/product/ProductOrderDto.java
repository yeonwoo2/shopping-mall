package com.example.maninstore.dto.product;

import lombok.Data;

import java.util.List;

@Data
public class ProductOrderDto {

    private String imgURL;
    private String name;
    private int price;
    private int dcRate;
    private boolean shippingFeeFree;
    private List<ProductOptionDto> productOption;

    public ProductOrderDto(String imgURL, String name, int price, int dcRate, boolean shippingFeeFree, List<ProductOptionDto> productOption) {
        this.imgURL = imgURL;
        this.name = name;
        this.price = price;
        this.dcRate = dcRate;
        this.shippingFeeFree = shippingFeeFree;
        this.productOption = productOption;
    }
}
