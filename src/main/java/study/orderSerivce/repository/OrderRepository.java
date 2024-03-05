package study.orderSerivce.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import study.orderSerivce.domain.entity.Order;
import study.orderSerivce.domain.entity.OrderItem;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public Long save(Order order){
        em.persist(em);
        return order.getId();
    }

    public Order findById(Long orderId){
        return em.find(Order.class,orderId);
    }

    public List<Order> findAll(){
        return em.createQuery("select o from Order o",Order.class)
                .getResultList();
    }

    public void delete(Order order){
        em.remove(order);
    }
}
