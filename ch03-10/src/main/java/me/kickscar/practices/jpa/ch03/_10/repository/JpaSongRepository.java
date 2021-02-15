package me.kickscar.practices.jpa.ch03._10.repository;

import me.kickscar.practices.jpa.ch03._10.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSongRepository extends JpaRepository<Song, Long>, JpaSongQryDslRepository {
}
