package edu.icet.model.dto;

import lombok.*;

@Data
public class ItemDTO {

    private int code;
    private String name;
    private String description;
    private double unitprice;
    private int qnt;
}
