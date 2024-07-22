package com.food.Food_Order.repo;

import com.food.Food_Order.model.Orderfood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_repo extends JpaRepository<Orderfood,Long> {
}
