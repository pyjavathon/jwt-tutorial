package hello.jwttutorial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import hello.jwttutorial.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	   @EntityGraph(attributePaths = "authorities")
	   Optional<User> findOneWithAuthoritiesByUsername(String username);

}
