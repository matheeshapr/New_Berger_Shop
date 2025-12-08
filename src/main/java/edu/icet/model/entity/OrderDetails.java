package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
public class OrderDetails {

    @Id
    private int id;
    private int itemCode;
    private int qnty;
    private double discount;



}
