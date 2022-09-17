package com.example.maninstore.controller;

import com.example.maninstore.dto.ResponseDto;
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

    @GetMapping("/api/product")
    public ResponseDto<String> productDetail(@RequestParam Long id){

        return new ResponseDto<String>(HttpStatus.OK.value(), "상품조회 완료");
    }

}
