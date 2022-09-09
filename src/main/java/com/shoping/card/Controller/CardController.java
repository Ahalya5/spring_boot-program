package com.shoping.card.Controller;

import com.shoping.card.Entity.CardDTO;
import com.shoping.card.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CardController {
    @Autowired
    private CardService cardService;
    @GetMapping("/getCard")
    public ArrayList<CardDTO> getAllCard(){
        return cardService.getAllCard();
    }
    @GetMapping("/getCard/{id}")
    public CardDTO findById(@PathVariable ("id") CardDTO cardDTO){
     return cardService.findById(cardDTO.getId());
    }
    @PostMapping("/createCard")
    public CardDTO create(@RequestBody CardDTO cardDTO){
        return cardService.create(cardDTO);
    }
    @PutMapping("/updateCard/{id}")
    public CardDTO update(@PathVariable ("id") Integer id ,@RequestBody CardDTO cardDTO){
        return cardService.update(id,cardDTO);
    }
    @DeleteMapping("/deleteCard/{id}")
    public void delete(@PathVariable ("id") Integer id){
        cardService.delete(id);
    }
}
