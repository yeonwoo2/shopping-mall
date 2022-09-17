package com.example.maninstore.service;

import com.example.maninstore.domain.Product;
import com.example.maninstore.domain.ProductDetail;
import com.example.maninstore.dto.product.ProductDetailDto;
import com.example.maninstore.repository.ProductDetailRepository;
import com.example.maninstore.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductDetailRepository productDetailRepository;

    public ProductDetailDto findProduct(Long productId){
        Optional<Product> findProduct = productRepository.findById(productId);
        Product product = findProduct.orElseThrow();

        List<ProductDetail> productDetailByProductId = productDetailRepository.findProductDetailByProductId(productId);


        return null;
//        return new ProductDetailDto(product.getName(), product.getPrice(), product.getDiscount(), product.getDescription(), )
    }

}
