package me.kickscar.practices.jpa.ch03._09.repository;

import me.kickscar.practices.jpa.ch03._09.domain.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JpaBlogRepository extends JpaRepository<Blog, Long>, JpaBlogQryDslRepository, JpaSpecificationExecutor<Blog> {
    public Page<Blog> findAll(Specification<Blog> spec, Pageable pageable);
}
