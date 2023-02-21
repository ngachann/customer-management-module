package com.example.customermanagementmodule.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class CustomerDTO {
    private String customerCode;
    private String customerName;
    private String address;
    private int age;

}
