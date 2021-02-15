package me.kickscar.practices.jpa.ch03._10.repository;

import me.kickscar.practices.jpa.ch03._10.domain.Song;

import java.util.List;

public interface JpaSongQryDslRepository {
    Song findById2(Long no);
    List<Song> findAll2();
    void deleteGenreByIdAndGenreId(Long songNo, Long genreNo);
}
