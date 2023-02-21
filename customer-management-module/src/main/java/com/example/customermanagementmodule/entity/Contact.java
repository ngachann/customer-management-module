package com.example.customermanagementmodule.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
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

}
