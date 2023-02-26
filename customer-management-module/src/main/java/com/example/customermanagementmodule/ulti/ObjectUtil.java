package com.example.customermanagementmodule.ulti;

public class ObjectUtil {
    public static Long convertValueToLong(Object x){
        return Long.parseLong(String.valueOf(x));
    }

    public static Integer convertValueToInteger(Object x){
        return Integer.parseInt(String.valueOf(x));
    }
}
