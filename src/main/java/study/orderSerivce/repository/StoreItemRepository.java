package study.orderSerivce.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import study.orderSerivce.domain.entity.Order;
import study.orderSerivce.domain.entity.StoreItem;


import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class StoreItemRepository {

    private final EntityManager em;

    public Long save(StoreItem storeItem){
        em.persist(em);
        return storeItem.getId();
    }

    public StoreItem findById(Long storeItemId){
        return em.find(StoreItem.class,storeItemId);
    }

    public List<StoreItem> findAll(){
        return em.createQuery("select si from StoreItem si",StoreItem.class)
                .getResultList();
    }

    public void delete(StoreItem storeItem){
        em.remove(storeItem);
    }
}
