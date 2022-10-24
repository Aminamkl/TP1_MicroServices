package com.maakoul.customerservice;

import com.maakoul.customerservice.dto.CustomerRequestDTO;
import com.maakoul.customerservice.services.CustomerServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerServiceImpl customerService) {
        return args -> {
            customerService.save(new CustomerRequestDTO("C01","adria","adria@gmail.com"));
            customerService.save(new CustomerRequestDTO("C02","openLab","openLab@gmail.com"));
            customerService.save(new CustomerRequestDTO("C03","Nimblways","Nimblways@gmail.com"));
        };
    }

}
