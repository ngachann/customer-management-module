package com.example.customermanagementmodule.service.customer;

import com.example.customermanagementmodule.entity.Customer;
import com.example.customermanagementmodule.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public List<Customer> showListCustomerByListString(String str) {
        var x = str.replaceAll(" ", ""); // thay thế các phần tử trắng bẳng phần tử rỗng , lúc này trong mảng ch còn code khách hàng vàdấu phẩy
        String[] y = x.split(",");
        List<Customer> customerList = new ArrayList<>();
        for(String i : y){
            customerList.add(customerRepository.findCustomerByCustomerCode(i));
        }
        return customerList;

    }
}
