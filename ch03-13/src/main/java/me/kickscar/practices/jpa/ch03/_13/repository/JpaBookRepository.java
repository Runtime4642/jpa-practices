package me.kickscar.practices.jpa.ch03._13.repository;

import me.kickscar.practices.jpa.ch03._13.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBookRepository extends JpaRepository<Book, Long> {
}
