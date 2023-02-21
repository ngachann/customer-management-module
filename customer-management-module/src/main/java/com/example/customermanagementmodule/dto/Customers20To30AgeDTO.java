package com.example.customermanagementmodule.dto;

import com.example.customermanagementmodule.entity.Contact;
import com.example.customermanagementmodule.entity.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Customers20To30AgeDTO {
    private CustomerDTO customerDTO;
    private List<Contact> contacts;
}
