package com.ust.ResturauntService.repo;

import com.ust.ResturauntService.model.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="feignreview",url="http://localhost:8084/reviews")
public interface ReviewFeign {
    @GetMapping("/customer/{customerId}")
    List<Review> getallreview(@PathVariable("customerId") Long cid);
}
