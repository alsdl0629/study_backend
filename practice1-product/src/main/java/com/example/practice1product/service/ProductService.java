package com.example.practice1product.service;

import com.example.practice1product.dto.MessageResponse;
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

    public MessageResponse save(ProductDto productDto) {
        Product product = Product.builder()
                .id(productDto.getId())
                .productName(productDto.getProductName())
                .productStock(productDto.getProductStock())
                .build();
        productRepository.save(product);

        return MessageResponse.builder()
                .message(productDto.getProductName() + " :: 저장 완료.")
                .build();
    }

    public ProductDto getProduct(Long id) {
        Optional<Product> product = productRepository.findById(id);

        return ProductDto.builder()
                .id(product.get().getId())
                .productName(product.get().getProductName())
                .productStock(product.get().getProductStock())
                .build();
    }

//    public ProductDto getProduct(Long id) {
//        Product product = productRepository.findById(id)
//                .orElseThrow();
//        return ProductDto.builder()
//                .id(product.get)
//                .build()
//    }

    public MessageResponse deleteProduct(Long id) {
        productRepository.deleteById(id);

        return MessageResponse.builder()
                .message("삭제 : " + id)
                .build();
    }

    public MessageResponse updateProduct(Long id, ProductDto productDto) {
        Product product = Product.builder()
                .id(productDto.getId())
                .productName(productDto.getProductName())
                .productStock(productDto.getProductStock())
                .build();
        productRepository.save(product);

        return MessageResponse.builder()
                .message(product.getProductName() + "수정 완료")
                .build();
    }
}
