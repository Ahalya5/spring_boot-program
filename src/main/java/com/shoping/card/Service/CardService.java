package com.shoping.card.Service;

import com.shoping.card.DAO.CardDAO;
import com.shoping.card.Entity.CardDTO;
import com.shoping.card.HibRepository.CardHibRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    @Autowired
    private CardHibRepository cardHibRepository;
    private ModelMapper modelMapper = new ModelMapper();
    public CardDAO convertDTOtoDAO(CardDTO cardDTO){
        return modelMapper.map(cardDTO ,CardDAO.class);
    }
    public CardDTO convertDAOtoDTO(CardDAO cardDAO){
        return modelMapper.map(cardDAO , CardDTO.class);
    }
//    get all card
    public ArrayList<CardDTO> getAllCard(){
        List<CardDAO> cardDAOList = cardHibRepository.findAll();
        ArrayList<CardDTO> cardDTO = new ArrayList<>();
        for(CardDAO cardDAO:cardDAOList){
            cardDTO.add(modelMapper.map(cardDAO,CardDTO.class));
        }
        return cardDTO;
    }
    // get by id card
    public CardDTO findById(int id){
        CardDAO cardDAO = cardHibRepository.findById(id);
        return modelMapper.map(cardDAO,CardDTO.class);
    }
    public CardDTO create(CardDTO cardDTO){
        CardDAO cardDAO = this.convertDTOtoDAO(cardDTO);
        cardDAO = cardHibRepository.create(cardDAO);
        return modelMapper.map(cardDAO,CardDTO.class);
    }
    public CardDTO update(int id,CardDTO cardDTO){
        CardDAO cardDAO = this.convertDTOtoDAO(cardDTO);
        cardDAO.setId(id);
        cardDAO = cardHibRepository.update(cardDAO);
        return modelMapper.map(cardDAO,CardDTO.class);
    }
    public void delete(int id){
        cardHibRepository.delete(id);
    }
}
