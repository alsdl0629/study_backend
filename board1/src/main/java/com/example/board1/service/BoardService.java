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

    public String createBoard(BoardDto boardDto) {
        boardRepository.save(boardDto.toEntity());
        return "저장";
    }

    public Optional<Board> getBoard(Long id) {
       return Board board = boardRepository.findById(id);
    }

}
