package com.example.customermanagementmodule.service.customer;

import com.example.customermanagementmodule.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> showListCustomerByListString(String str) {
//        "abc,abc,agh"
        // dinh minh hieu
        return null;

    }
}
