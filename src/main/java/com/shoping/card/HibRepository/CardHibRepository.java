package com.shoping.card.HibRepository;

import com.shoping.card.DAO.CardDAO;
import com.shoping.card.Entity.CardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CardHibRepository {
    @Autowired
    private EntityManager entityManager;



    // get all card
    public List<CardDAO> findAll(){
        TypedQuery<CardDAO> query = entityManager.createQuery("from CardDAO",CardDAO.class);
        List<CardDAO> query1 = query.getResultList();
        return  query1;
    }
    public CardDAO findById(int id){
        CardDAO cardDAO = entityManager.find(CardDAO.class, id);
        return cardDAO;
    }
    public CardDAO create(CardDAO cardDAO){
        entityManager.persist(cardDAO);
        return cardDAO;
    }
    public CardDAO update(CardDAO cardDAO){
        entityManager.persist(cardDAO);
        return cardDAO;
    }
    public void delete(int id){
        Query query = entityManager.createQuery("delete from CardDAO where id=:id");
         query.setParameter("id",id);
         query.executeUpdate();
    }
}
