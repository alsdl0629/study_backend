package com.example.hellospring.service;

import com.example.hellospring.domain.Member;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MemberServiceTest {

    MemberService memberService = new MemberService();


    @Test
    void 회원가입() {
        //given(주어짐)
        Member member = new Member();
        member.setName("hello");

        //when(실행할때)
        Long saveId = memberService.join(member);

        //then(결과가 이게 나와야돼)
        Member findMember = memberService.findOne(saveId).get();
        org.assertj.core.api.Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복_회원_예외() {
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        try {
            memberService.join(member2);
            fail();
        } catch (IllegalStateException e) {
            
        }
        //then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}