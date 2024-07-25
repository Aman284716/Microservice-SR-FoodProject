package com.ust.ResturauntService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {
    private Long id;
    private Long customerId;
    private Long orderId;
    private String review;
}
