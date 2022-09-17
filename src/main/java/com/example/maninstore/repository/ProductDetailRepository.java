package com.example.maninstore.repository;

import com.example.maninstore.domain.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {

    @Query("select p from ProductDetail p left join fetch p.product left join fetch p.productOption where p.product.id = :productId")
    List<ProductDetail> findProductDetailByProductId(@Param("productId") Long id);

}
