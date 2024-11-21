package dev.zay.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // Primitive Data Types
        int number = 10;
        double price = 10.50;
        char grade = 'A';
        boolean isJavaFun = true;

        // Non-Primitive Data Types
        String greeting = "Hello World";
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));
        System.out.println("ABED".indexOf("B", 1));
    }
}
