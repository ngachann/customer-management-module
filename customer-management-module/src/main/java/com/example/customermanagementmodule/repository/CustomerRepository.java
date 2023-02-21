package com.example.customermanagementmodule.repository;

import com.example.customermanagementmodule.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findCustomerByCustomerCode(String Str);
}
