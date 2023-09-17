package org.collins_romeo_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
     int[] numbers = {56,78,96,90};
     Arrays.stream(numbers).filter(x -> x < 90).forEach(x -> System.out.println(x));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

        ArrayList<String> str = new ArrayList<>(Arrays.asList("Abuja","Lagos","Ekiti","Enugu","Kano"));
        str.stream().map(x -> x + " Is a State in Nigeria"  ).collect(Collectors.toList()).forEach(x -> System.out.println(x));

    }
}