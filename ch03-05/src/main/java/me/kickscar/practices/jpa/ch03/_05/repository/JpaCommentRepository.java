package me.kickscar.practices.jpa.ch03._05.repository;

import me.kickscar.practices.jpa.ch03._05.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCommentRepository extends JpaRepository<Comment, Long>, JpaCommentQryDslRepository {
}
