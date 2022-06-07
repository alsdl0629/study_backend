package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원이 저장소에 저장
    Optional<Member> findById(Long id); //저장소에서 찾아옴
    Optional<Member> findByName(String name);
    List<Member> findAll(); //저장된 리스트를 모두 반환
}
