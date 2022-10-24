package com.maakoul.customerservice.mappers;

import com.maakoul.customerservice.dto.CustomerRequestDTO;
import com.maakoul.customerservice.dto.CustomerResponseDTO;
import com.maakoul.customerservice.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDTOToCustomer(CustomerRequestDTO customerRequestDTO);
}
