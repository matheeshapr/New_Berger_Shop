package edu.icet.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Data
public class OrderDTO {
    private int id;
    private String custid;
    private String day;
}