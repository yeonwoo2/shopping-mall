package com.example.maninstore.controller;

import com.example.maninstore.dto.ResponseDto;
import com.example.maninstore.dto.product.ProductDetailDto;
import com.example.maninstore.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")
    public ResponseDto<ProductDetailDto> productDetail(@RequestParam Long id){

        ProductDetailDto product = productService.findProduct(id);
        return new ResponseDto<ProductDetailDto>(HttpStatus.OK.value(), product);
    }

}
