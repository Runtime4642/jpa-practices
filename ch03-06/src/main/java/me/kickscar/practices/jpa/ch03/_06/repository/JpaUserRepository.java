package me.kickscar.practices.jpa.ch03._06.repository;

import me.kickscar.practices.jpa.ch03._06.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {
}
