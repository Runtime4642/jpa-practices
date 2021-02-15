package me.kickscar.practices.jpa.ch03._10.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import me.kickscar.practices.jpa.ch03._10.domain.QGenre;
import me.kickscar.practices.jpa.ch03._10.domain.QSong;
import me.kickscar.practices.jpa.ch03._10.domain.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import javax.persistence.Query;
import java.util.List;


public class JpaSongQryDslRepositoryImpl extends QuerydslRepositorySupport implements JpaSongQryDslRepository {

    @Autowired
    private JPAQueryFactory queryFactory;

    public JpaSongQryDslRepositoryImpl() {
        super(Song.class);
    }

    @Override
    public Song findById2(Long no) {
        return queryFactory
                .selectDistinct(QSong.song)
                .from(QSong.song)
                .leftJoin(QSong.song.genres, QGenre.genre)
                .fetchJoin()
                .where(QSong.song.no.eq(no))
                .fetchOne();
    }

    @Override
    public List<Song> findAll2() {
        return queryFactory
                .selectDistinct(QSong.song)
                .from(QSong.song)
                .leftJoin(QSong.song.genres, QGenre.genre)
                .fetchJoin()
                .fetch();
    }

    @Override
    public void deleteGenreByIdAndGenreId(Long songNo, Long genreNo) {
        String sqlString = "DELETE from song_genre where song_no=? and genre_no=?";
        Query query = getEntityManager().createNativeQuery(sqlString);

        query.setParameter(1, songNo);
        query.setParameter(2, genreNo);

        query.executeUpdate();
    }

}