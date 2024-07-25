package com.ust.ResturauntService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ResturauntServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResturauntServiceApplication.class, args);
	}

}
