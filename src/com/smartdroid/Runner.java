package com.smartdroid;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayListScratchpad list = new ArrayListScratchpad();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    list.printItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }

        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print all the instructions");
        System.out.println("\t 1 - Print list of items");
        System.out.println("\t 2 - Add items");
        System.out.println("\t 3 - Modify items");
        System.out.println("\t 4 - Remove items");
        System.out.println("\t 5 - Search for items");
        System.out.println("\t 6 - Quit");
    }

    public static void addItem() {
        System.out.println("Enter the grocery item:");
        list.addItemToList(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item name:");
        String itemNumber = scanner.nextLine();
        System.out.println("Enter replacement item:");
        String newItem = scanner.nextLine();
        list.replaceItem(itemNumber, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        list.removeItem(itemNo);

    }

    public static void searchItem() {
        System.out.println("Enter the item to search:");
        String itemName = scanner.nextLine();
        if ((list.onFile(itemName))) {
            System.out.println("Found " + itemName + " in our grocery list");
        } else {
            System.out.println("Item is not in the list");
        }
    }

    public static void processArrayList() {

        // 1
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(list.getListOfString());

        // 2
        ArrayList<String> nextArray = new ArrayList<>(list.getListOfString());

        // 3 (with conversion)
        String[] myArray = new String[list.getListOfString().size()];
        myArray = list.getListOfString().toArray(myArray);
    }
}
