package com.example.customermanagementmodule.repository;

import com.example.customermanagementmodule.dto.CustomerDTO;
import com.example.customermanagementmodule.dto.Customers20To30AgeDTO;
import com.example.customermanagementmodule.dto.show.ContactDto;
import com.example.customermanagementmodule.entity.Contact;
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
}
