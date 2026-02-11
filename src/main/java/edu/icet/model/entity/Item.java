package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
public class Item {

    @Id
    private int code;
    private String name;
    private String description;
    private double unitprice;
    private int qnt;
}
