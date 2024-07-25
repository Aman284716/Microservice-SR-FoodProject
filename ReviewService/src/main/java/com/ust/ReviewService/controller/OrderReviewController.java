package com.ust.ReviewService.controller;

import com.ust.ReviewService.model.OrderReview;
import com.ust.ReviewService.service.OrderReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class OrderReviewController {

    private final OrderReviewService orderReviewService;

    @Autowired
    public OrderReviewController(OrderReviewService orderReviewService) {
        this.orderReviewService = orderReviewService;
    }

    @GetMapping("/customer/{customerId}")
    public List<OrderReview> getOrderReviewsByCustomerId(@PathVariable Long customerId) {
        return orderReviewService.findByCustomerId(customerId);
    }

    @PostMapping("/addAll")
    public List<OrderReview> addAllReviews(@RequestBody List<OrderReview> reviews) {
        return orderReviewService.addAllReviews(reviews);
    }
}

