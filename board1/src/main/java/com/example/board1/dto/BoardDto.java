package com.example.board1.dto;

import com.example.board1.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDto {

    private Long id;

    private String password;

    public BoardEntity toEntity() {
        return BoardEntity.builder()
                .id(id)
                .password(password)
                .build();
    }
}
