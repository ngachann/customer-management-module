package com.example.customermanagementmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CustomerManagementModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerManagementModuleApplication.class, args);

        String myStr = "Hello , abc, def";
        var x = myStr.replaceAll(" ", "");
        String[] y = x.split(",");

        List<String> stringList = new ArrayList<>();
        for(String i : y){
            System.out.println(i);
            stringList.add(i);
        }
        System.out.println(stringList);

    }
}
