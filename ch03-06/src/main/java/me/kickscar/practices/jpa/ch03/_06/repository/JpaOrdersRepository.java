package me.kickscar.practices.jpa.ch03._06.repository;

import me.kickscar.practices.jpa.ch03._06.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrdersRepository extends JpaRepository<Orders, Long>, JpaOrdersQryDslRepository {
}
