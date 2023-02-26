package com.example.customermanagementmodule.controller;

import com.example.customermanagementmodule.dto.CustomerAge;
import com.example.customermanagementmodule.dto.Customers20To30AgeDTO;
import com.example.customermanagementmodule.dto.show.CustomerDto;
import com.example.customermanagementmodule.entity.Customer;
import com.example.customermanagementmodule.service.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class ContactController {
    private final CustomerService customerService;

    @GetMapping("/showListCustomerByStringCode")  // hiện ra danh sách có trong chuỗi code
    public ResponseEntity<List<CustomerDto>> showByStirngCode(@RequestBody String str){
        return ResponseEntity.ok(customerService.showListCustomerByListString(str));
    }
    @PostMapping("/createCustomer") // thêm mới 1 customer
    public ResponseEntity<Object> createCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.createCustomer(customer));
    }
    @GetMapping("/showListBetween20and30") // hiện ra danh sách thông tin contact mà customer.age trong khoảng 20 và 30
    public ResponseEntity<List<Customers20To30AgeDTO>> show20and30s(){
        return ResponseEntity.ok(customerService.findCustomerByAgeBetween20and30());
    }
    @GetMapping("/SumDttsrrAndDtttrr") // tổng dtttrr và dttsrr của toàn bộ khách hàng
    public int Sum(){
        return customerService.Sum();
    }
    @GetMapping("/SumDttsrrAndDtttrrByAge") // tính tổng dtttrr và dttsrr theo độ tuổi nhập vào
    public int SumByAge(@RequestBody int age){
        return customerService.SumByAge(age);
    }

    @GetMapping("/AgeByCustomer")
    public ResponseEntity<List<CustomerAge>> showAgeByCustomer(){
        return ResponseEntity.ok(customerService.AgeByCustomer());
    }
}
