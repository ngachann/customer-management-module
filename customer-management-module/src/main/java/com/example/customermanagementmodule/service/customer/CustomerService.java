package com.example.customermanagementmodule.service.customer;

import com.example.customermanagementmodule.dto.Customers20To30AgeDTO;
import com.example.customermanagementmodule.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> showListCustomerByListString(String str);

}
