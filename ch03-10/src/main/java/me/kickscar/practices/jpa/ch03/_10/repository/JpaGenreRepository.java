package me.kickscar.practices.jpa.ch03._10.repository;

import me.kickscar.practices.jpa.ch03._10.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaGenreRepository extends JpaRepository<Genre, Long>{
    Genre findByName(String name);
}
