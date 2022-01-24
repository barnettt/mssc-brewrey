package guru.springframework.msscbrewrey.services;

import guru.springframework.msscbrewrey.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomer(String id);
    CustomerDto createCustomer(CustomerDto customerDto);
    void updateCustomer(CustomerDto customer);
    void deleteCustomer(String customerId);
}
