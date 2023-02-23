package com.example.customermanagementmodule.dto;

import com.example.customermanagementmodule.entity.Contact;
import com.example.customermanagementmodule.entity.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@RequiredArgsConstructor
@Getter
public class Customers20To30AgeDTO {
    @JsonProperty("contactName")
    private String contactName;
    @JsonProperty("contactCode")
    private String contactCode;
    @JsonProperty("position")
    private String position;

}
