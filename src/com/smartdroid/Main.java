package com.smartdroid;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Arrays examples: Manual Initialization

        int intArray[];
        intArray = new int[10];
        int intArray3[] = new int[30]; // inline variable
        intArray[0] = 35;
        intArray[1] = 11;
        intArray[2] = 56;
        intArray[3] = 97;
        System.out.println(intArray[1]);

        // Arrays examples: Array Initializer

        int intArray2[] = {45, 67, 90, 21, 33};
        System.out.println(intArray2[4]);

        String stringArray[] = {"A", "B", "C", "D", "E"};
        System.out.println(stringArray.length); // index
        System.out.println(stringArray[3]); // value


        // Array table

        System.out.println("Index\tValues");
        int intArray4[] = {28, 22, 18, 94, 57, 34, 27, 88, 92};

        for (int i = 0; i < intArray4.length; i++) {
            System.out.println(i + "      \t" + intArray4[i]);
        }

        // Summing values in an Array

        int intArray5[] = {34, 56, 77, 89, 92, 33};
        int sum = 0;
        for (int i = 0; i < intArray5.length; i++) {
            sum = sum += intArray5[i];
        }
        System.out.println("Sum is = " + sum);
        int average = sum / 5;
        System.out.println("Average is =" + average);

        // Same example, but using a For-Each loop pattern instead
        // Template for For-Each -> for(dataType[] identifier : arrayName)

        int intArray6[] = {34, 56, 77, 89, 92, 33};
        int sum1 = 0;
        for (int counter : intArray6) {
            sum1 = sum1 += counter;
        }
        System.out.println("Sum is = " + sum1);
        int average1 = sum1 / 5;
        System.out.println("Average is = " + average1);

        // More on Each For Loop
        // It's easy to look at it as a real-life example
        // Using the For Each Loop allows you to:
        // - avoid using the length();
        // - naming the iterator in a meaningful way
        // - avoid incrementing the counter

        String shoppingList[] = {"Milk", "Bread", "Butter", "Fish", "Veggies"};
        for (String item : shoppingList) {
            System.out.println(item);
        }

        // Arrays used with methods

        int bucky[] = {3, 4, 5, 6, 7};
        change(bucky);
        for (int counter : bucky) {
            System.out.println(counter);
        }
    }

    public static void change(int x[]) {
        for (int counter = 0; counter < x.length; counter++) {
            x[counter] += 5;
        }
    }
}


