package com.example.customermanagementmodule.dto.show;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class ContactDto {
    private String contactName;
    private String contactCode;
    private String position;
}
