package com.example.maninstore.repository.custom;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class ProductOptionRepositoryImpl implements ProductOptionRepositoryCustom {

    private final JPAQueryFactory queryFactory;
//
//    @Override
//    public List<ProductDetail> findProductOptionByProductId(Long id) {
//        List<Tuple> result = queryFactory
//                .select(product, productOption)
//                .from(productDetail)
//                .join(productDetail.product, product)
//                .join(productDetail.productOption, productOption)
//                .where(product.id.eq(id))
//                .fetch();
//        return null;
//    }
}
