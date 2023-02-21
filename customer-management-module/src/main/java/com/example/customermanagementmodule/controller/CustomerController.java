package com.example.customermanagementmodule.controller;

import com.example.customermanagementmodule.dto.CustomerDTO;
import com.example.customermanagementmodule.service.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/get-all-customer")
    public ResponseEntity<CustomerDTO> getAllCustomer(){
        return new  ResponseEntity(customerService.getListCustomer(), HttpStatus.OK);
    }

}
