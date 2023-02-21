package com.example.customermanagementmodule.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "customer")
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(generator = "customer_seq", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "customer_seq", sequenceName = "id_customer_seq", allocationSize = 1)
    private Long idCustomer;
    @Column(name = "customer_code")
    private String customerCode;
    @Column(name = "customer_name")
    private String customerName;
    private String address;
    private int age;
    private Long dttsrr;
    private Long dtttrr;
    

}
