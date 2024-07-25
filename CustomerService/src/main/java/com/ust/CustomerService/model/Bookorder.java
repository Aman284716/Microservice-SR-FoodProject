package com.ust.CustomerService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bookorder {
    private Long id;
    private Long customerid;
    private String ordername;
    private Long price;
}