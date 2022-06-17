package com.example.test.dto;

import com.example.test.entity.ProductEntity;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDto {
    private Long id;
    private String product;
    private String order;
    private String orderList;

    public ProductEntity toEntity(){
        return ProductEntity.builder()
                .id(id)
                .product(product)
                .order2(order)
                .orderList(orderList)
                .build();
    }
}
