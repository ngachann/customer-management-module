package com.example.customermanagementmodule.dto;

import com.example.customermanagementmodule.entity.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContactDTO {
    private String contactName;
    private String contactCode;
    private String position;
    private int age;
    private String address;
}
