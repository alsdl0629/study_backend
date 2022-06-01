package com.example.test1.controller;

import com.example.test1.dto.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @PostMapping("/default")
    public String postMethod(){
        return "Hello World";
    }
    //http:localhost:8080/api/v1/post-api/member
    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map ->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    //http:localhost:8080/api/v1/post-api/member2
    @PostMapping("/member2")
    public String postMember2(@RequestBody MemberDTO memberDTO){ //@RequestBody를 붙이지 않으면 null값이 들어감
        return memberDTO.toString();
    }
}
