package com.smartdroid.ArrayListChallenge;

// https://coderanch.com/t/271631/java/Multidimensional-ArrayList

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Matteo");
        names.add("Jim");
        names.add("Mark");
        names.add("Tom");
        names.add("Mike");
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("12345");
        numbers.add("3456");
        numbers.add("111111");
        numbers.add("22222");
        numbers.add("444444");

        ArrayList<ArrayList<String>> contacts = new ArrayList<ArrayList<String>>();
        contacts.add(new ArrayList<String>());
        (contacts.get(0)).addAll(names);
        contacts.add(new ArrayList<>());
        (contacts.get(1)).addAll(numbers);
        int i = 0;
        int j = 0;
        // display contents of contacts
        for (i = 0; i < contacts.size(); i++) {
            for (j = 0; j < (contacts.get(i)).size(); j++) {
                System.out.print((contacts.get(i)).get(j) + "  ");
            }
            System.out.println();
        }

    }
}