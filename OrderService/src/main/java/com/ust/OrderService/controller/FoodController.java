package com.ust.OrderService.controller;

import com.ust.OrderService.OrderServiceApplication;
import com.ust.OrderService.model.BookOrder;
import com.ust.OrderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class FoodController {
    @Autowired
    OrderService orderService;

    @GetMapping
    public String getFoodList() {
        return "List of foods";
    }

    @PostMapping("/addorder")
    public BookOrder addorder(@RequestBody BookOrder orderin){
        return orderService.addOrder(orderin);
    }

    @PostMapping("/allorder")
    public List<BookOrder> allorders(@RequestBody List<BookOrder> orders){
        return orderService.addallOrder(orders);
    }

    @GetMapping("/{cid}")
    public List<BookOrder> getFoodById(@PathVariable Long cid){
        return orderService.findBycId(cid);
    }
}
