package com.ust.OrderService.service;

import com.netflix.discovery.converters.Auto;
import com.ust.OrderService.model.BookOrder;
import com.ust.OrderService.repo.Orderrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    Orderrepo orderrepo;
    public BookOrder addOrder(BookOrder orderin) {
        return orderrepo.save(orderin);
    }

    public List<BookOrder> addallOrder(List<BookOrder> orders) {
        return orderrepo.saveAll(orders);
    }

    public List<BookOrder> findBycId(Long cid) {
        return orderrepo.findByCustomerid(cid);
    }
}
