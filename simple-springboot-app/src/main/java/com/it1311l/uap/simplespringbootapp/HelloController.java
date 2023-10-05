package com.it1311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/sort")
    public int[] sortInteger() {
        int[] numbers = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        return numbers;
    }
}
