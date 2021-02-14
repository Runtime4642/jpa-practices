package me.kickscar.practices.jpa.ch03._02.repository;

import java.util.List;

import me.kickscar.practices.jpa.ch03._02.domain.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaGuestbookRepository extends JpaRepository<Guestbook, Long> {
	List<Guestbook> findAllByOrderByRegDateDesc();
	int deleteByNoAndPassword(Long no, String password);
}
