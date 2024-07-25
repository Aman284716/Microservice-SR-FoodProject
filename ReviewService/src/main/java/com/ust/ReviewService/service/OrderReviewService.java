package com.ust.ReviewService.service;

import com.ust.ReviewService.model.OrderReview;
import com.ust.ReviewService.repo.OrderReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderReviewService  {
    @Autowired
    private OrderReviewRepository orderReviewRepository;

    public List<OrderReview> findByCustomerId(Long customerId) {
        return orderReviewRepository.findByCustomerId(customerId);
    }

    public List<OrderReview> addAllReviews(List<OrderReview> reviews) {
        return orderReviewRepository.saveAll(reviews);
    }
}


