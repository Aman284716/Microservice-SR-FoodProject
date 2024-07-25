package com.ust.ReviewService.repo;


import com.ust.ReviewService.model.OrderReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderReviewRepository extends JpaRepository<OrderReview, Long> {
    List<OrderReview> findByCustomerId(Long customerId);
//    OrderReview findByCustomerIdAndOrderId(Long customerId, Long orderId);
}

