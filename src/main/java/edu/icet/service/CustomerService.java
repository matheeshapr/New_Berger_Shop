package edu.icet.service;

import edu.icet.model.entity.Customer;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void add(Customer customer) {
        customerRepository.save(customer);
    }
}
