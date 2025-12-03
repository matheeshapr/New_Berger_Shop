package edu.icet.service;

import edu.icet.controller.OrderDetailsController;
import edu.icet.model.entity.OrderDetails;
import edu.icet.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsService {

    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    public void add(OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
    }
}
