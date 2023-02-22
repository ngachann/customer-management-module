package com.example.customermanagementmodule.service.customer;

import com.example.customermanagementmodule.dto.CustomerDTO;
import com.example.customermanagementmodule.dto.Customers20To30AgeDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> searchCustomerDto(String str);
}
