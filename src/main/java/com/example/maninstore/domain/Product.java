package com.example.maninstore.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    private String description;

    private String color;

    private String size;

    private int price;

    private int stockQuantity;

    private int discount;

    public static Product createProduct(String name,
                                        String description,
                                        String color,
                                        String size,
                                        int price,
                                        int stockQuantity,
                                        int discount){

        Product product = new Product();
        product.name = name;
        product.description = description;
        product.color = color;
        product.size = size;
        product.price = price;
        product.stockQuantity = stockQuantity;
        product.discount = discount;
        return  product;
    }
}
