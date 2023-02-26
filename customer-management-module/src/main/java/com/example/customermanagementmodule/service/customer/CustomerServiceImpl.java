package com.example.customermanagementmodule.service.customer;

import com.example.customermanagementmodule.dto.*;
import com.example.customermanagementmodule.dto.show.ContactDto;
import com.example.customermanagementmodule.dto.show.CustomerDto;
import com.example.customermanagementmodule.entity.Contact;
import com.example.customermanagementmodule.entity.Customer;
import com.example.customermanagementmodule.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper mapper;
    @Override
    public List<CustomerDto> showListCustomerByListString(String str) {
        var x = str.replaceAll(" ", ""); // thay thế các phần tử trắng bẳng phần tử rỗng , lúc này trong mảng ch còn code khách hàng vàdấu phẩy
        String[] y = x.split(",");
        List<Customer> customerList = new ArrayList<>();
        for(String i : y){                  // gọi ra và lưu các phần tử vào mảng có kiểu customer
            customerList.add(customerRepository.findCustomerByCustomerCode(i));
        }
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer i : customerList){ // map mảng trên thành kiều dto
            CustomerDto a = mapper.map(i,CustomerDto.class);
            customerDtos.add(a);
        }
        return customerDtos;
    }

    @Override
    public ResultDto createCustomer(Customer customer) {
        try {
            customerRepository.save(customer);
        }catch (Exception e){
            return ResultDto.builder().code(400).message(e.getMessage()).build();
        }
        return ResultDto.builder().code(200).message("thanh cong").build();
    }
    @Override
    public List<Customers20To30AgeDTO> findCustomerByAgeBetween20and30() {
        List<Customer> customers = customerRepository.getCustomerByAgeBetween20And30();
        List<Customers20To30AgeDTO> customers20To30AgeDTOS = new ArrayList<>();
        for (Customer i : customers){
            List<Contact> contacts = i.getContacts();
            for (Contact a : contacts){
                Customers20To30AgeDTO x = mapper.map(a,Customers20To30AgeDTO.class);
                customers20To30AgeDTOS.add(x);
            }
        }
        return customers20To30AgeDTOS;
    }

    @Override
    public int Sum() {
        return customerRepository.SumDttsrr()+customerRepository.SumDtttrr();
    }

    @Override
    public int SumByAge(int age) {
        int x = customerRepository.SumDttsrrByAge(age)+customerRepository.SumDtttrrByAge(age);
        return x;
    }
    // chuyển từ dữ liệu trong db sang dto trong project
    @Override
    public List<CustomerAge> AgeByCustomer() {
        List<Object[]> objectList = customerRepository.AgeByCustomer();
        return objectList.stream().map(x->new CustomerAge(x)).collect(Collectors.toList());
    }
}
