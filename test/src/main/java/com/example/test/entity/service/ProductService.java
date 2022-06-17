package com.example.test.entity.service;

import com.example.test.dto.ProductDto;

public interface ProductService {
    ProductDto saveProduct(Long id, String product, String order, String orderList);

    ProductDto getProduct(Long id);
}
