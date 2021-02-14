package me.kickscar.practices.jpa.ch03._04.repository;

import me.kickscar.practices.jpa.ch03._04.domain.Orders;
import me.kickscar.practices.jpa.ch03._04.domain.User;
import me.kickscar.practices.jpa.ch03._04.dto.UserDto;

import java.util.List;

public interface JpaUserQryDslRepository {
    public UserDto findById2(Long no);
    public Boolean update(User user);

    public List<User> findAllCollectionJoinProblem();
    public List<User> findAllCollectionJoinProblemSolved();
    public List<User> findAllCollectionJoinAndNplusOneProblemSolved();

    public List<Orders> findOrdersByNo(Long no);
}
