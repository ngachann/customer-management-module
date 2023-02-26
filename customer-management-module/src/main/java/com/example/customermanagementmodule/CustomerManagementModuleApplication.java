package com.example.customermanagementmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class CustomerManagementModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerManagementModuleApplication.class, args);
        List<String> strings = Arrays.asList("args", "123", "code", "learn", "abc");
        List<String> filter = strings.stream().collect(Collectors.toList());
        System.out.println(strings);
        System.out.println(filter);

        Object x = 5;
//        String x = "5";
//        int num = Integer.parseInt(x);
        //String.valueOf(x); chuyển đổi x từ kiểu dữ liệu bất kì thành chuỗi

    }
}