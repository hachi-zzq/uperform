package com.example.uperform;

import org.apache.commons.lang3.Range;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UperformConsoleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UperformConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        final String fizz = "Fizz";
        final String buzz = "Buzz";
        final String fizzBuzz = "FizzBuzz";

        for (Integer i : getRangeNumber(1, 100)) {
            if (Calculator.divideByThree(i) || Calculator.containNumber(i.toString(), "3")) {
                System.out.println(fizz);
                continue;
            }
            if (Calculator.divideByFive(i) || Calculator.containNumber(i.toString(), "5")) {
                System.out.println(buzz);
                continue;
            }

            System.out.println(i);
        }
    }


    public static List<Integer> getRangeNumber(Integer start, Integer end) {
        return IntStream.range(start, end + 1).boxed().collect(Collectors.toList());
    }


}
