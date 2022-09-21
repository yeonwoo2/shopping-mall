package com.example.maninstore.controller;

import com.example.maninstore.dto.ResponseDto;
import com.example.maninstore.dto.product.ProductOrderDto;
import com.example.maninstore.dto.product.ProductOrderCondition;
import com.example.maninstore.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BuyController {

    private final ProductService productService;

    @GetMapping("/purchase-product")
    public ProductOrderDto ByProduct(@RequestBody ProductOrderCondition productOrderCondition){

        System.out.println("ProductOrderCondition size=======" + productOrderCondition.getProduct_id());
        ProductOrderDto productOrderDto = productService.purchaseProduct(productOrderCondition);
        return productOrderDto;
    }
}
