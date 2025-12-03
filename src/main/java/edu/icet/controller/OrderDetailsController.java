package edu.icet.controller;

import edu.icet.model.entity.OrderDetails;
import edu.icet.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orderdetails")
public class OrderDetailsController {

    @Autowired
    OrderDetailsService orderDetailsService;

    @PostMapping("adddetails")
    public void addDetails(@RequestBody OrderDetails orderDetails){
        orderDetailsService.add(orderDetails);

    }

}
