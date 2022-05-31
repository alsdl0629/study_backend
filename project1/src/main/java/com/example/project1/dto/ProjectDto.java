package com.example.project1.dto;

import com.example.project1.entity.ProjectEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProjectDto {
    private String product;
    private String order;
    private String orderList;

    public ProjectEntity toEntity(){
        return ProjectEntity.builder()
                .product(product)
                .order(order)
                .orderList(orderList)
                .build();
    }
}
