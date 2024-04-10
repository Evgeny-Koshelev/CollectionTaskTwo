package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] check  = {1, 2, 3, 1, 3, 1};

        Map<Integer, Long>result = count(check);
        System.out.println(result);



    }
    static <T> Map<T, Long> count(T[] t) {
        return Arrays.stream(t).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }
}