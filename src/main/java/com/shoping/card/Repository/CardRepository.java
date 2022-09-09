package com.shoping.card.Repository;

import com.shoping.card.DAO.CardDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardDAO, Integer> {

}
