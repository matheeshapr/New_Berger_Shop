package edu.icet.service;

import edu.icet.model.entity.Orders;
import edu.icet.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void add(Orders orders) {
        orderRepository.save(orders);
    }
}
