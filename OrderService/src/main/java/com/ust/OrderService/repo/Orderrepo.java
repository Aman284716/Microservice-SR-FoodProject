package com.ust.OrderService.repo;

import com.ust.OrderService.model.BookOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Orderrepo extends JpaRepository<BookOrder, Long> {
    List<BookOrder> findByCustomerid(Long customerid);
}
