package com.example.testproject1.controller;

import com.example.testproject1.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/name")
    public String getName(){
        return "Kang";
    }

    @GetMapping("/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    @GetMapping("/variable2/{variable}")
    public String GetVariable(@PathVariable("variable") String var){
        return var;
    }

    @GetMapping("/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization){
        return name + " " + email + " " + organization;
    }

    @GetMapping("/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map ->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping("/request3")
    public String getRequestParam3(MemberDTO memberDTO){
        return memberDTO.toString();
    }
}
