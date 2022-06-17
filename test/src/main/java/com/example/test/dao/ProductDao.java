package com.example.test.dao;

import com.example.test.entity.ProductEntity;

public interface ProductDao {
    ProductEntity saveProduct(ProductEntity product);

    ProductEntity getProduct(Long id);
}
