package hello.jwttutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hello.jwttutorial.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

}
