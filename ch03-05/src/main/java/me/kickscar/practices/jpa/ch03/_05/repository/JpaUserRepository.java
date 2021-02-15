package me.kickscar.practices.jpa.ch03._05.repository;

import me.kickscar.practices.jpa.ch03._05.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {
}
