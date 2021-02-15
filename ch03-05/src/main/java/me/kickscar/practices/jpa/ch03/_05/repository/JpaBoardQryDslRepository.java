package me.kickscar.practices.jpa.ch03._05.repository;

import me.kickscar.practices.jpa.ch03._05.domain.Board;
import me.kickscar.practices.jpa.ch03._05.dto.BoardDto;
import me.kickscar.practices.jpa.ch03._05.dto.CommentDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface JpaBoardQryDslRepository {
    public Board findById2(Long no);
    public BoardDto findById3(Long no);
    public Board findById4(Long no);

    public List<BoardDto> findAll3(Pageable pageable);

    public List<CommentDto> findCommentsByNo(Long no);
}
