package com.revature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        List<Integer> evens =
                integers
                        .stream()
                        .filter(n -> n % 2 == 0)
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(evens);
    }
}
