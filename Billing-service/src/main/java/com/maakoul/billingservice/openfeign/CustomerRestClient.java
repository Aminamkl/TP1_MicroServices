package com.maakoul.billingservice.openfeign;


import com.maakoul.billingservice.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {
    @GetMapping(path = "/api/customers/{id}")
    Customer customerById(@PathVariable(name = "id") String id);
    @GetMapping(path = "/api/customers")
    List<Customer> getCustomers();

}
