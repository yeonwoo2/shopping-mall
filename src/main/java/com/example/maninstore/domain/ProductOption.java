package com.example.maninstore.domain;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String size;

    private String color;

    private int stockQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}
