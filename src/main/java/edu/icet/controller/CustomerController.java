package edu.icet.controller;

import edu.icet.model.entity.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("addcustomer")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.add(customer);
    }
}
