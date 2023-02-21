package com.example.customermanagementmodule.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ContactRequest {
    private String contactName;
    private String contactCode;
    private String position;
}
