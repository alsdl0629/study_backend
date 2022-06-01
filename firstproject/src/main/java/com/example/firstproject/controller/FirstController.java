package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceTOMeetYou(Model model){
        model.addAttribute("username","민");
        return "greetings";// templates/greetings.mustache -> 브라우저로 전송
    }

    @GetMapping("/bye")
    public String seeTouNext(Model model) {
        model.addAttribute("nickname", "민");
        return "goodbye";
    }
}
