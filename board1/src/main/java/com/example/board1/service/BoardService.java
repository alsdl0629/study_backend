package com.example.board1.service;


import com.example.board1.domain.Board;
import com.example.board1.controller.dto.BoardDto;
import com.example.board1.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public Long createBoard(BoardDto boardDto) {
        boardRepository.save(boardDto.toEntity());
        return boardDto.getId();
    }

    public Optional<Board> getBoard(Long id) {
       Optional<Board> board = boardRepository.findById(id);
       return board;
    }

}
