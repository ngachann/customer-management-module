package com.example.customermanagementmodule.entity;

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
    @GeneratedValue(generator = "contact_seq", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "contact", sequenceName = "id_contact_seq", allocationSize = 1)
    private Long idContact;
    @Column(name = "contact_name")
    private String contactName;
    @Column(name = "contact_code")
    private String contactCode;
    private String position;
    private String address;
    private int age;

    @ManyToOne
    @JoinColumn(name = "customer_id_customer")
    @JsonIgnore
    private Customer customer;

}
