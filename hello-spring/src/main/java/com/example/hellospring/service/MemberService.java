package com.example.hellospring.service;

import com.example.hellospring.domain.Member;
import com.example.hellospring.repository.MemberRepository;
import com.example.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Transactional //jpa를 쓰려면 필요 데이터를 저장하거나 변경할때 있어야함
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 회원 가입
     */
    public Long join(Member member) {
        //같은 이름이 있는 중복 회원X
        validateDuplicateMember(member); //중복 회원 검중
        memberRepository.save(member);
        return member.getId();
    }

    private  void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
            .ifPresent(m -> { //ifPresent null이 아닌 값이 있으면 밑에 로직이 동작함.Optional 이여서 가능.아니였으면 if가 널이 아니면으로 작성.
                throw new IllegalStateException("이미 존재하는 회원입니다.");
            });
    }

    /**
     *전체 회원 조회
     */
    public List<Member> findMembers() {
         return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
