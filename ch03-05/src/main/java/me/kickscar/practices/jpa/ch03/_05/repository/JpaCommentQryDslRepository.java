package me.kickscar.practices.jpa.ch03._05.repository;

import me.kickscar.practices.jpa.ch03._05.domain.Comment;

public interface JpaCommentQryDslRepository {
    public void save(Long boardNo, Comment ...comment);
}
