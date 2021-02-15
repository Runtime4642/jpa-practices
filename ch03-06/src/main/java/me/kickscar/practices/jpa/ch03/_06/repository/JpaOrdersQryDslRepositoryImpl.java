package me.kickscar.practices.jpa.ch03._06.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import me.kickscar.practices.jpa.ch03._06.domain.Orders;
import me.kickscar.practices.jpa.ch03._06.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import javax.persistence.EntityManager;

public class JpaOrdersQryDslRepositoryImpl extends QuerydslRepositorySupport implements JpaOrdersQryDslRepository {

    @Autowired
    private JPAQueryFactory queryFactory;

    public JpaOrdersQryDslRepositoryImpl() {
        super(Orders.class);
    }

    @Override
    public void save(Long userNo, Orders... ordersList) {
        EntityManager em = getEntityManager();

        User user = em.find(User.class, userNo);

        for(Orders orders :  ordersList) {
            em.persist(orders);
            user.getOrders().add(orders);
        }

    }
}
