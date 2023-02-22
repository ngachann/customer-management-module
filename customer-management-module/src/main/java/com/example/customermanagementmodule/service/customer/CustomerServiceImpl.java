package com.example.customermanagementmodule.service.customer;

import com.example.customermanagementmodule.dto.CustomerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerDTO> searchCustomerDto(String str) {
        // "abc, dce,add"
        //   1,2,3
        

        return null;
    }
}
