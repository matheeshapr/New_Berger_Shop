package edu.icet.model.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
public class Customer {

    @Id
    private int id;
    private String name;
    private String address;
    private double ssalary;
}
