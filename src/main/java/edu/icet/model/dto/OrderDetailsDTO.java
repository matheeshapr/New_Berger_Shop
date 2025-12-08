package edu.icet.model.dto;

import lombok.*;

@Data
public class OrderDetailsDTO {

    private int id;
    private int itemCode;
    private int qnty;
    private double discount;
}
