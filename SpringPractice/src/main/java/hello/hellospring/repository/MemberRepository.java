package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.Optional;

public interface MemberRepository {
    Member save(Menber member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<>
}
