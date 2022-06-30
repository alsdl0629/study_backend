package com.example.practice1product.controller;

import com.example.practice1product.dto.ProductDto;
import com.example.practice1product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/product")
    public ProductDto saveProduct(@RequestBody ProductDto productDto) {
        return productService.save(productDto);
    }

    @GetMapping("/product/{id}")
    public ProductDto getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }


    @DeleteMapping("/product/{id}")
    public String noProduct(@PathVariable Long id) {
        return "삭제 : " + id;
    }

}
