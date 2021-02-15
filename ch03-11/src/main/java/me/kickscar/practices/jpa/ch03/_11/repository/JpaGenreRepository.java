package me.kickscar.practices.jpa.ch03._11.repository;

import me.kickscar.practices.jpa.ch03._11.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaGenreRepository extends JpaRepository<Genre, Long>, JpaGenreQryDslRepository  {
}
