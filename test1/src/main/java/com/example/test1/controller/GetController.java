package com.example.test1.controller;

import com.example.test1.dto.MemberDTO;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    // http://localhost:8080/api/v1/get-api/hello
    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }

    // http://localhost:8080/api/v1/get-api/name
    @GetMapping("/name")
    public String getName() {
        return "Kang Min";
    }

    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping("/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    // http://localhost:8080/api/v1/get-api/variable2/{String 값}
    @GetMapping("variable2/{variable}")
    public String getVariable2(@PathVariable("variable")String var) {
        return var;
    }

    // http://localhost:8080/api/v1/get-api/request1?name=Kangmain&email=alsdl0629@naver.com&organization=highschool
    @GetMapping("/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    // http://localhost:8080/api/v1/get-api/request2?key1=value1&key2=value2
    @GetMapping("/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map-> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        /*
        param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));
         */
        return sb.toString();
    }

    // http://localhost:8080/api/v1/get-api/request3?name=KangMin&email=alsdl0629@naver.com&organization=highschool
    @GetMapping("/request3")
    public String getRequest3(MemberDTO memberDTO){
        //return memberDTO.getName() + " " + memberDTO.getEmail() + " " + memberDTO.gerOrganization();
        return memberDTO.toString();
    }
}
