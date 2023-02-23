package com.example.customermanagementmodule.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity(name = "contact")
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String contactName;
    private String contactCode;
    private String position;
    @ManyToOne
    @JoinColumn(name = "customer_id_customer",nullable = false,referencedColumnName = "id")
    @JsonBackReference
    private Customer customer;
}
