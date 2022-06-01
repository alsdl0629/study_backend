package com.example.test1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/del-api")
public class DeleteController {

    @DeleteMapping("/default/{variable}")
    public String DeleteVariable(@PathVariable String variable){ return variable; }
}
