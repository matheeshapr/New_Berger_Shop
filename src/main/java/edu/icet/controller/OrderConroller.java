package edu.icet.controller;

import edu.icet.model.entity.Orders;
import edu.icet.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderConroller {

    @Autowired
    OrderService orderService;

    @PostMapping("addorder")
    public void addOrder(@RequestBody Orders orders){
        orderService.add(orders);
    }

//        @GetMapping("getAll")
//    public String getAll(){
//        return "Matheesha";
//    }
}
