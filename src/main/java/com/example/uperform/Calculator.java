package com.example.uperform;

import org.apache.commons.lang3.StringUtils;

public class Calculator {

    public static Boolean divideByThree(Integer number) {
        return number % 3 == 0;
    }

    public static Boolean divideByFive(Integer number) {
        return number % 5 == 0;
    }

    public static Boolean containNumber(String number, String search) {
        return StringUtils.contains(number, search);
    }

}
