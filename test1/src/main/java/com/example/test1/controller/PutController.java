package com.example.test1.controller;

import com.example.test1.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @PutMapping("/default")
    public String putMethod(){return "Hello World";}

    @PutMapping("/member")
    public String putMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map ->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PutMapping("/member1")
    public String postMemberDto1(@RequestBody MemberDTO memberDTO){
        return memberDTO.toString();
    }

    @PutMapping("/member2")
    public MemberDTO postMemberDto2(@RequestBody MemberDTO memberDTO){
        return memberDTO;  //클라이언트 개발자가 편안
    }

    @PutMapping("/member3")
    public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);   //body(memberDTO = return memberDTO
    }

}
