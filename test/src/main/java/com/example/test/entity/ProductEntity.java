package com.example.test.entity;

import com.example.test.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "test1")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String product;
    String order2;
    String orderList;
    
    public ProductDto toDto() {
        return ProductDto.builder()
                .id(id)
                .product(product)
                .order(order2)
                .orderList(orderList)
                .build();
    }
}
