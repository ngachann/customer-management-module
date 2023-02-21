package com.example.customermanagementmodule.controller;

import com.example.customermanagementmodule.entity.Customer;
import com.example.customermanagementmodule.service.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class ContactController {
    private final CustomerService customerService;


    @GetMapping("/showListCustomerByStringCode")
    public ResponseEntity<List<Customer>> showByStirngCode(@RequestBody String str){
        return ResponseEntity.ok(customerService.showListCustomerByListString(str));
    }
}
