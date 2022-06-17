package com.example.test.controller;

import com.example.test.dto.ProductDto;
import com.example.test.entity.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product/{id}")
    public ProductDto getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @PostMapping("/product")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {

        Long id = productDto.getId();
        String product = productDto.getProduct();
        String order = productDto.getOrder();
        String orderList = productDto.getOrderList();

        return productService.saveProduct(id,  product, order, orderList);
    }

}
