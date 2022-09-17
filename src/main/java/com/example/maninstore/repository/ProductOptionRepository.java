package com.example.maninstore.repository;

import com.example.maninstore.domain.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductOptionRepository extends JpaRepository<ProductOption, Long> {

    @Query("select o from ProductOption o left join fetch o.product where o.product.id = :productId")
    List<ProductOption> findProductOptionByProductId(@Param("productId") Long id);

}
