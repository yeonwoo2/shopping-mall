package com.example.maninstore.domain;

import lombok.*;

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

    private int price;

    private int discount;

    public static Product createProduct(String name,
                                        String description,
                                        int price,
                                        int discount){

        Product product = new Product();
        product.name = name;
        product.description = description;
        product.price = price;
        product.discount = discount;
        return  product;
    }
}
