package study.orderSerivce.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import study.orderSerivce.domain.entity.StoreItem;
import study.orderSerivce.domain.entity.User;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class UserRepository {

    private final EntityManager em;

    public Long save(User user){
        em.persist(em);
        return user.getId();
    }

    public User findById(Long userId){
        return em.find(User.class,userId);
    }


    public List<User> findAll(){
        return em.createQuery("select u from User u",User.class)
                .getResultList();
    }

    public void delete(User user){
        em.remove(user);
    }

}
