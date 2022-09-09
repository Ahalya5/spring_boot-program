package com.shoping.card.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "Card_ahalya")
public class CardDAO {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "shop_name")
    private String shopName;

    @Column (name = "thinks_name")
    private String thinksName;

    @Column (name = "price")
    private int price;
}
