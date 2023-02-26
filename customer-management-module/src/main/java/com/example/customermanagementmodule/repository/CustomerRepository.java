package com.example.customermanagementmodule.repository;

import com.example.customermanagementmodule.dto.CustomerAge;
import com.example.customermanagementmodule.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>, JpaSpecificationExecutor<Customer> {
    Customer findCustomerByCustomerCode(String Str);
    @Query(value = "SELECT customer.id, customer.age, contact.contact_name,contact.contact_code,contact.position FROM contact INNER JOIN customer ON contact.customer_id_customer = customer.id where age between 20 and 30 ",nativeQuery = true)
    List<Object> findListBetween20and30();
    @Query(value = "select * from customer where age between 20 and 30",nativeQuery = true)
    List<Customer> findCustomersByAgeBetween20And30(); // trả ra mảng customer 20-30;
                                                      // mapping sang dto đầu ra
    @Query(value = "select * from customer where age between 20 and 30",nativeQuery = true)
    List<Customer> getCustomerByAgeBetween20And30();
    @Query(value = "select sum(dttsrr) from customer",nativeQuery = true)
    int SumDttsrr();
    @Query(value = "select sum(dtttrr) from customer",nativeQuery = true)
    int SumDtttrr();
    @Query(value = "select sum(dttsrr) from customer where age = ?1",nativeQuery = true)
    int SumDttsrrByAge(int age);
    @Query(value = "select sum(dttsrr) from customer where age = ?1",nativeQuery = true)
    int SumDtttrrByAge(int age);
    @Query(value = "select count(age) as num ,age as age from customer GROUP BY age",nativeQuery = true)
    List<Object[]> AgeByCustomer();
}