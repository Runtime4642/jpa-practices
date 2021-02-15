package me.kickscar.practices.jpa.ch03._07.repository;

import me.kickscar.practices.jpa.ch03._07.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, String> {
}
