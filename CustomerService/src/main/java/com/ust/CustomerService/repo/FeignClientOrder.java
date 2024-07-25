package com.ust.CustomerService.repo;

import com.ust.CustomerService.model.Bookorder;
import jakarta.ws.rs.Path;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="feignorder",url="http://localhost:8081/orders")
public interface FeignClientOrder {
    @GetMapping("/{cid}")
    List<Bookorder> getallorders(@PathVariable("cid") Long cid);
}
