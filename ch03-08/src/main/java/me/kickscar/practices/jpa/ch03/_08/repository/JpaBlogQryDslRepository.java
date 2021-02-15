package me.kickscar.practices.jpa.ch03._08.repository;


import me.kickscar.practices.jpa.ch03._08.domain.Blog;
import me.kickscar.practices.jpa.ch03._08.dto.BlogDto;

import java.util.List;

public interface JpaBlogQryDslRepository {
    List<Blog> findAll2();
    List<BlogDto> findAll3();
}
