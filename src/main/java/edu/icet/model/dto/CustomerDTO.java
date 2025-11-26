package edu.icet.model.dto;

import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {

    private int id;
    private String name;
    private String address;
    private double ssalary;
}
