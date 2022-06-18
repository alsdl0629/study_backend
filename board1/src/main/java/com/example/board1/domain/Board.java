package com.example.board1.domain;

import com.example.board1.dto.BoardDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Board {
    @Id
    private Long id;
    private String password;


    public BoardDto toDto() {
        return BoardDto.builder()
                .id(id)
                .password(password)
                .build();
    }
}
