package me.kickscar.practices.jpa.ch03._14.repository;

import me.kickscar.practices.jpa.ch03._14.domain.CartItem;
import me.kickscar.practices.jpa.ch03._14.dto.CartItemDto;

import java.util.List;

public interface JpaCartItemQryDslRepository {
    List<CartItem> findAllByUserNo2(Long userNo);
    List<CartItemDto> findAllByUserNo3(Long userNo);
    void deleteByUserNoAndBookNo2(Long userNo, Long bookNo);
}
