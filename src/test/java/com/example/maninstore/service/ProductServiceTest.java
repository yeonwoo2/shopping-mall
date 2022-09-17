package com.example.maninstore.service;

import com.example.maninstore.domain.Product;
import com.example.maninstore.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ProductServiceTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    public void findProductById(){
        Optional<Product> findProduct = productRepository.findById(2L);
        Product product = findProduct.orElseThrow();

        System.out.println("product===" + product);
    }
}