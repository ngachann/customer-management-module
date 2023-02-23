package com.example.customermanagementmodule.service.customer;

import com.example.customermanagementmodule.dto.Customers20To30AgeDTO;
import com.example.customermanagementmodule.dto.ResultDto;
import com.example.customermanagementmodule.dto.show.ContactDto;
import com.example.customermanagementmodule.dto.show.CustomerDto;
import com.example.customermanagementmodule.entity.Contact;
import com.example.customermanagementmodule.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> showListCustomerByListString(String str); // tìm các customer theo chuỗi code truyền vào
    ResultDto createCustomer(Customer customer);        // tạo customer

    List<Customers20To30AgeDTO> findCustomerByAgeBetween20and30();
}
