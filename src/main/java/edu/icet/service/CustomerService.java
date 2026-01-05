package edu.icet.service;

import edu.icet.model.entity.Customer;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void add(Customer customer) {
        customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public List<Customer> searchByName(String name) {
        return Collections.singletonList(customerRepository.findByName(name));
    }



//    public Customer <Customer> searchStudent(Integer id) {
//        return customerRepository.findById(id);
//    }
}


