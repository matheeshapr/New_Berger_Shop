package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.entity.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("addcustomer")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.add(customer);
    }

    @GetMapping("getcustomer")
    public List<Customer> getAll(){
        return customerService.getAllCustomer();
    }

//    @GetMapping("{id}")
//    public Customer searchById(@PathVariable Integer id){
//        return customerService.searchStudent(id);
//    }

    @GetMapping("/searchbyname/{name}")
    public List<Customer> searchName(@PathVariable String name){
        return customerService.searchByName(name);

    }



}
