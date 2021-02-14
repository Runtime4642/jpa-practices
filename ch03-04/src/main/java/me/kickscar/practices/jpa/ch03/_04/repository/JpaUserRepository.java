package me.kickscar.practices.jpa.ch03._04.repository;

import me.kickscar.practices.jpa.ch03._04.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long>, JpaUserQryDslRepository {
    public User findByEmailAndPassword(String email, String password);
}
