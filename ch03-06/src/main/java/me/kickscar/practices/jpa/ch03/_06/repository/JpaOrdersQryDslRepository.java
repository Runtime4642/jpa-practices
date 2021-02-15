package me.kickscar.practices.jpa.ch03._06.repository;

import me.kickscar.practices.jpa.ch03._06.domain.Orders;

public interface JpaOrdersQryDslRepository {
    public void save(Long userNo, Orders...orders);

}
