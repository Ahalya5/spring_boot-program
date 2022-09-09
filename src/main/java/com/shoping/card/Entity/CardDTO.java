package com.shoping.card.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private int id;
    private String shopName;
    private String thinksName;
    private int price;
}
