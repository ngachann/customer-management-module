package com.example.customermanagementmodule.dto;

import com.example.customermanagementmodule.ulti.ObjectUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@RequiredArgsConstructor
@Getter
public class CustomerAge {
    @JsonProperty("num")
    private Long num;
    @JsonProperty("age")
    private Integer age;
    public CustomerAge(Object[] x) {
        this.num = ObjectUtil.convertValueToLong(x[0]);
        this.age = ObjectUtil.convertValueToInteger(x[1]);
    }
}
