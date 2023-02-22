package com.example.customermanagementmodule.dto.show;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Data
public class CustomerDto {
    @JsonProperty("customerCode")
    private String customerCode;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("address")
    private String address;
    @JsonProperty("age")
    private int age;
    @JsonProperty("dttsrr")
    private Long dttsrr;
    @JsonProperty("dtttrr")
    private Long dtttrr;
    @JsonProperty("contacts")
    private List<ContactDto> contacts;
}
