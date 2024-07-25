package com.ust.OrderService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookOrder {
    @Id
    private Long id;

    private Long customerid;
    private String ordername;
    private Long price;
}
