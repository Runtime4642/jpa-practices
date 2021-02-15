package me.kickscar.practices.jpa.ch03._11.repository;

import me.kickscar.practices.jpa.ch03._11.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSongRepository extends JpaRepository<Song, Long> {
}
