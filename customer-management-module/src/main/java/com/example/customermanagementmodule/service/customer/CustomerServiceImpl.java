package com.example.customermanagementmodule.service.customer;

import com.example.customermanagementmodule.dto.CustomerDTO;
import com.example.customermanagementmodule.entity.Customer;
import com.example.customermanagementmodule.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final ModelMapper modelMapper;
    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> getListCustomer() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for (Customer cus: customers) {
            CustomerDTO customerDTO = modelMapper.map(cus, CustomerDTO.class);
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }
}
