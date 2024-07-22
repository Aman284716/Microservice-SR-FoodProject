package com.food.Food_Order.service;

import com.food.Food_Order.model.Orderfood;
import com.food.Food_Order.repo.Order_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_service {
    @Autowired
    Order_repo or;

    public Orderfood saveOrder(Orderfood o) {
        return or.save(o);
    }

    public List<Orderfood> getAllOrders() {
        return or.findAll();
    }

    public Orderfood getOrderById(Long id) {
        return or.findById(id).orElse(null);
    }

    public String deleteOrderById(Long id){
        or.deleteById(id);
        return "Order with id " + id + " deleted successfully";
    }
}
