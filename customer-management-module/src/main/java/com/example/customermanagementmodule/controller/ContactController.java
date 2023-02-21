package com.example.customermanagementmodule.controller;

import com.example.customermanagementmodule.entity.Contact;
import com.example.customermanagementmodule.service.contact.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;

    @GetMapping("/get-contact-by-contact-code")
    public ResponseEntity<Contact> getContactByContactCode(@RequestParam String contactCode){
        Contact contact = contactService.getContactInListCustomer(contactCode);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

}
