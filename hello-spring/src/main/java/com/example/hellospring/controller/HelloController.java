package com.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @GetMapping("/hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("/hello-string")
    @ResponseBody //http바디에 리턴값을 직접 넣어줌
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("/hello-api") //API방식
    @ResponseBody //HttpMessageConverter작동함->문자면 StringConverter 동작함 ||객체면 JsonConverter 동작함
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello; //객체를 리턴 json방식, spring이 객체를 반환하고 @ResponseBody라고 하면 json으로 반환함
    }
    static class Hello {  //static클래스를 쓰면 HelloController클래스안에서 클래스를 쓸수있음 HelloController.Hello
        private String name;
        public String getName() {  //꺼낼때
            return name;
        }
        public void setName(String name) {  //넣을때
            this.name = name;
        }
    }

}
