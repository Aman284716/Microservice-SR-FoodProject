package com.food.Food_Order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "foodorders")
public class Orderfood {
    @Id
    Long orderId;
    String customerName;
    String foodItem;
    Double price;
    int quantity;
    Long CustomerID;
}
