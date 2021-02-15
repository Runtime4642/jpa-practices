package me.kickscar.practices.jpa.ch03._07.repository;

import me.kickscar.practices.jpa.ch03._07.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBlogRepository extends JpaRepository<Blog, Long> {
}
