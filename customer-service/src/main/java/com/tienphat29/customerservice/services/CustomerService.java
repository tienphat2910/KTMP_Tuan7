package com.tienphat29.customerservice.services;

import com.tienphat29.customerservice.entities.Customer;

public interface CustomerService {
    Customer save(Customer customer);
    Customer findById(long id);
}

