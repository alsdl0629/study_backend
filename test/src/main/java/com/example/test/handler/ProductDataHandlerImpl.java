package com.example.test.handler;

import com.example.test.dao.ProductDao;
import com.example.test.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {

    private final ProductDao productDao;

    @Override
    public ProductEntity saveProductEntity(Long id, String product, String order, String orderList) {
        ProductEntity productEntity = new ProductEntity(id, product, order ,orderList);

        return productDao.saveProduct(productEntity);
    }

    @Override
    public ProductEntity getProductEntity(Long id) {
        return productDao.getProduct(id);
    }
}
