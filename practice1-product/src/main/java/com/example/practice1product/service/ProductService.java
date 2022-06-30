package com.example.practice1product.service;

import com.example.practice1product.dto.ProductDto;
import com.example.practice1product.entity.Product;
import com.example.practice1product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductDto save(ProductDto productDto) {
        Product product = productDto.toEntity();
        productRepository.save(product);
        return product.toDto();
    }

    public ProductDto getProduct(Long id) {
        Optional<Product> product = productRepository.findById(id);
        ProductDto productDto = product.get().toDto();
        return productDto;
    }

    public Long deleteProduct(Long id) {
        productRepository.deleteById(id);
        return id;
    }
}
