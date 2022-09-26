package com.example.maninstore.service;

import com.example.maninstore.domain.Product;
import com.example.maninstore.domain.ProductOption;
import com.example.maninstore.dto.product.ProductDetailDto;
import com.example.maninstore.dto.product.ProductOptionDto;
import com.example.maninstore.dto.product.ProductOrderDto;
import com.example.maninstore.dto.product.ProductOrderCondition;
import com.example.maninstore.repository.ProductOptionRepository;
import com.example.maninstore.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductOptionRepository productOptionRepository;

    public ProductDetailDto findProduct(Long productId){
        Optional<Product> findProduct = productRepository.findById(productId);
        Product product = findProduct.orElseThrow();

        List<ProductOption> productOptions = productOptionRepository.findProductOptionByProductId(productId);
        List<ProductOptionDto> productOptionDto = productOptions.stream().map(p -> new ProductOptionDto(p.getSize(), p.getColor(), p.getStockQuantity())).collect(Collectors.toList());

        return new ProductDetailDto(product.getName(), product.getPrice(), product.getDiscount(), product.getDescription(), productOptionDto);
    }

    public ProductOrderDto purchaseProduct(ProductOrderCondition productOrderCondition){
        Optional<Product> findProduct = productRepository.findById(productOrderCondition.getProduct_id());
        Product product = findProduct.orElseThrow();
        List<ProductOptionDto> productOption = productOrderCondition.getProductOption();

        return new ProductOrderDto(null, product.getName(), product.getPrice(), product.getDiscount(), false, productOption);
    }

}
