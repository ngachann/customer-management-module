package com.example.customermanagementmodule.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "customer")
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String customerCode;
    private String customerName;
    private String address;
    private int age;
    private int dttsrr;
    private int dtttrr;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Contact> contacts;
}
