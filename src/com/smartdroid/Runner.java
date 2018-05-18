package com.smartdroid;

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
        System.out.println("Enter the item number:");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item:");
        String newItem = scanner.nextLine();
        list.replaceItem(itemNumber - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        list.removeItem(itemNo-1);

    }

    public static void searchItem() {
        System.out.println("Enter the item to search:");
        String itemName = scanner.nextLine();
        if ((list.findItem(itemName) != null)) {
            System.out.println("Found " + itemName + " in our grocery list");
        } else {
            System.out.println("Item is not in the list");
        }
    }
}
