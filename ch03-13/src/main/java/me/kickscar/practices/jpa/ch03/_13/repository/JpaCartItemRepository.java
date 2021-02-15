package me.kickscar.practices.jpa.ch03._13.repository;

import me.kickscar.practices.jpa.ch03._13.domain.CartItemId;
import me.kickscar.practices.jpa.ch03._13.domain.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaCartItemRepository extends JpaRepository<CartItem, CartItemId>, JpaCartItemQryDslRepository {
    List<CartItem> findAllByUserNo(Long userNo);
    void deleteByUserNoAndBookNo(Long userNo, Long bookNo);
}
