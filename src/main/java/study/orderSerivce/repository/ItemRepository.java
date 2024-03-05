package study.orderSerivce.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import study.orderSerivce.domain.entity.User;
import study.orderSerivce.domain.entity.item.Item;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class ItemRepository {

    private final EntityManager em;

    public Long save(Item item){
        em.persist(em);
        return item.getId();
    }

    public Item findById(Long itemId){
        return em.find(Item.class,itemId);
    }

    public List<Item> findAll(){
        return em.createQuery("select i from Item i",Item.class)
                .getResultList();
    }

    public void delete(Item item){
        em.remove(item);
    }
}
