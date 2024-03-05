package study.orderSerivce.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import study.orderSerivce.domain.entity.OrderItem;
import study.orderSerivce.domain.entity.item.Item;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class OrderItemRepository {

    private final EntityManager em;

    public Long save(OrderItem orderItem){
        em.persist(em);
        return orderItem.getId();
    }

    public OrderItem findById(Long orderItem){
        return em.find(OrderItem.class,orderItem);
    }

    public List<OrderItem> findAll(){
        return em.createQuery("select oi from OrderItem oi",OrderItem.class)
                .getResultList();
    }

    public void delete(OrderItem orderItem){
        em.remove(orderItem);
    }
}
