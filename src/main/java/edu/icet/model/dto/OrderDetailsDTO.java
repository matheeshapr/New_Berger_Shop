package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetailsDTO {

    private int id;
    private int itemCode;
    private int qnty;
    private double discount;
}
