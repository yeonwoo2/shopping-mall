package com.example.maninstore.repository.custom;

import com.example.maninstore.dto.product.QProductDetailDto;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.example.maninstore.domain.QProduct.product;
import static com.example.maninstore.domain.QProductOption.productOption;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ProductOptionRepositoryImplTest {

    @Autowired
    JPAQueryFactory queryFactory;

//    @Test
//    public void join(){
//        List<Tuple> result = queryFactory
//                .select(product, productOption)
//                .from(productDetail)
//                .join(productDetail.product, product)
//                .join(productDetail.productOption, productOption)
//                .where(product.id.eq(1L))
//                .fetch();
//
//        for (Tuple tuple : result) {
//            System.out.println("tuple==" + tuple);
//        }
//    }
}