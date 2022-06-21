package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    //인터페이스가 인터페이스를 받을때는 extends, 인터페이스는 다중상속 가능
    //JPQL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
