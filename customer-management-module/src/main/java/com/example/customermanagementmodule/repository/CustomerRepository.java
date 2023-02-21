package com.example.customermanagementmodule.repository;

import com.example.customermanagementmodule.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "SELECT c.* \n" +
            "FROM customer c join contact c2 on c.id_customer = c2.customer_id_customer \n" +
            "WHERE c.age BETWEEN 20 AND 30", nativeQuery = true)
    List<Customer> getListCustomerByAge();
}
