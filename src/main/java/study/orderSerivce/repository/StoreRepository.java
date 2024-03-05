package study.orderSerivce.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import study.orderSerivce.domain.entity.Store;
import study.orderSerivce.domain.entity.User;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class StoreRepository {

    private final EntityManager em;

    public Long save(Store store){
        em.persist(em);
        return store.getId();
    }

    public Store findById(Long storeId){
        return em.find(Store.class,storeId);
    }

    public List<Store> findAll(){
        return em.createQuery("select s from Store s",Store.class)
                .getResultList();
    }

    public void delete(Store store){
        em.remove(store);
    }
}
