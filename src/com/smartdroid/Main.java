package com.smartdroid;

import java.util.Arrays;
import java.util.Random;

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


        // Array table or Multi-dimensional array

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

        // Arrays used with methods -> the method adds five more numbers to intArray7[]

        int intArray7[] = {3, 4, 5, 6, 7};
        addNumbers(intArray7);
        for (int counter : intArray7) {
            System.out.println(counter);
        }
    }

    public static void addNumbers(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 5;

        }

        // Multi-dimensional Arrays
        // template: dataType+arrayNem+[][];
        // Super useful for table and coordinates with rows and columns

        int multiIntArray[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
        int multiIntArray2[][] = {{30, 31, 32, 33}, {43}, {4, 5, 6}};


        /* to initialize elements
          Each {} it counts as row, so three {} {} {} is 0,1,2 rows
          To call the elements inside the {} count as normal, so for multiInArray[][]:
          multiIntArray[0][0] = 8;
          multiIntArray[1][0] = 12;
          multiIntArray[1][2] = 14;
         */

        System.out.println("First Array");
        printMultiArray(multiIntArray);

        System.out.println("Second Array");
        printMultiArray(multiIntArray2);
    }

    // you need 2 loops to initialize a multi-dimensional array
    // one loop for columns, one loop for rows
    public static void printMultiArray(int array[][]) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + "\t");
            }
            System.out.println();
        }

        // Arrays as counters
        // Dice-rolling -> store the numbers each time in an array
        // Face = index
        // Value = freq

        Random rand = new Random();
        int freq[] = new int[7];

        for (int roll = 1; roll < 1000; roll++) {
            ++freq[1 + rand.nextInt(6)];
        }
        System.out.println("Face\tFrequency");

        for (int face = 0; face < freq.length; face++) {
            System.out.println(face + "\t    " + freq[face]);
        }

        // Copy an Array
        int originalArray[] = new int[10];
        int[] numberCopy = Arrays.copyOf(originalArray, 5);
        for (int row : numberCopy) {
            System.out.print(row);
        }
        System.out.println("\n");

        // Copy an array within a range-values
        int[] numberCopyRange = Arrays.copyOfRange(originalArray, 3, 6);
        for (int row : numberCopyRange) {
            System.out.print(row);
        }

        // Print a whole Array
        System.out.println(Arrays.toString(originalArray));

        // Fill an Array
        // Essentially, puts the second argument in all the indexes of the given array
        int[] arrayFill = new int[100];
        Arrays.fill(arrayFill, 23);
        System.out.println(Arrays.toString(arrayFill));

        // Sorting an array

        int[] toSort = new int[10];

        for (int i = 0; i < 10; i++) {

            toSort[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(toSort);
        System.out.println(Arrays.toString(toSort));

        // Quick Binary Search
        // Return the index of the value IF it finds it, otherwise returns -1
        int whereIs50 = Arrays.binarySearch(toSort, 51);
        System.out.println(whereIs50);


    }
}


