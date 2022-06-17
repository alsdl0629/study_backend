package com.example.test.entity.service;

import com.example.test.dto.ProductDto;
import com.example.test.entity.ProductEntity;
import com.example.test.handler.ProductDataHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDataHandler testDataHandler;

    @Override
    public ProductDto saveProduct(Long id, String product, String order, String orderList) {
        ProductEntity productEntity = testDataHandler.saveProductEntity(id, product, order, orderList);

        ProductDto productDto = new ProductDto(productEntity.getId(),
                productEntity.getProduct(), productEntity.getOrder2(), productEntity.getOrderList());

        return productDto;
    }

    @Override
    public ProductDto getProduct(Long id) {
        ProductEntity productEntity = testDataHandler.getProductEntity(id);

        ProductDto productDto = new ProductDto(productEntity.getId(), productEntity.getProduct(),
                productEntity.getOrder2(), productEntity.getOrderList());

        return productDto;
    }
}
