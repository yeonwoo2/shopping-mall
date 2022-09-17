package com.example.maninstore.repository.custom;

import com.example.maninstore.domain.ProductDetail;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDetailRepositoryCustom {

    List<ProductDetail> findProductDetailByProductId(Long id);
}
