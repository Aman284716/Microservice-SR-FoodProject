package com.food.Food_Order.controller;

import com.food.Food_Order.model.Orderfood;
import com.food.Food_Order.service.Order_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class Order_Controller {
    @Autowired
    Order_service os;

    @PostMapping
    public Orderfood addOrder(@RequestBody Orderfood order){
        return os.saveOrder(order);
    }

    @GetMapping
    public List<Orderfood> getOrderList(){
        return os.getAllOrders();
    }

    @GetMapping("{id}")
    public Orderfood getOrderById(@PathVariable Long id){
        return os.getOrderById(id);
    }

    @DeleteMapping("{id}")
    public String deleteOrder(@PathVariable Long id){
        return os.deleteOrderById(id);
    }

}
