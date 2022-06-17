package com.example.test.dao;

import com.example.test.entity.ProductEntity;
import com.example.test.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDaoImpl implements ProductDao {
    private final Repository repository;

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        return repository.save(productEntity);
    }

    @Override
    public ProductEntity getProduct(Long id) {
        ProductEntity productEntity = repository.getReferenceById(id);
        return productEntity;
    }
}
