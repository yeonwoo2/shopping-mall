package com.example.maninstore.repository.custom;

import com.example.maninstore.domain.ProductDetail;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductDetailRepositoryImpl implements ProductDetailRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<ProductDetail> findProductDetailByProductId(Long id) {
        return null;
    }
}
