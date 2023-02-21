package com.example.customermanagementmodule.service.contact;

import com.example.customermanagementmodule.entity.Contact;
import com.example.customermanagementmodule.entity.Customer;
import com.example.customermanagementmodule.exception.NotFoundException;
import com.example.customermanagementmodule.repository.ContactRepository;
import com.example.customermanagementmodule.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService{
    private final CustomerRepository customerRepository;
    private final ContactRepository contactRepository;
    private final ModelMapper modelMapper;


    @Override
    public Contact getContactInListCustomer(String contactCode) {
        List<Customer> customers = customerRepository.getListCustomerByAge();
        for (Customer cus: customers) {
            List<Contact> contacts =  cus.getContacts();
            for (Contact co: contacts) {
                if(co.getContactCode().contentEquals(contactCode)){
                    return co;
                }
            }
        }
        throw new NotFoundException("Không tìm thấy contact: " + contactCode,500);
    }
}
