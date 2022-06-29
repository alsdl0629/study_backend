package com.example.board1.controller;


import com.example.board1.controller.dto.BoardDto;
import com.example.board1.domain.Board;
import com.example.board1.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/member/{id}")
    public Optional<Board> getBoard(@PathVariable Long id) {
        return boardService.getBoard(id);
    }
    @PostMapping("/member")
    public void createBoard(@RequestBody BoardDto boardDto) {
        boardService.createBoard(boardDto);
    }



}
