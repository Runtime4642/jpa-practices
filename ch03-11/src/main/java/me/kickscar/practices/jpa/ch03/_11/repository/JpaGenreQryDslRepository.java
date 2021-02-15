package me.kickscar.practices.jpa.ch03._11.repository;

import me.kickscar.practices.jpa.ch03._11.domain.Genre;

import java.util.List;

public interface JpaGenreQryDslRepository {
    Genre findById2(Long no);
    List<Genre> findAll2();
}
