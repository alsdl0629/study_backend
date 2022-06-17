package com.example.test.handler;

import com.example.test.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(Long id, String product, String order, String orderList);

    ProductEntity getProductEntity(Long id);
}
