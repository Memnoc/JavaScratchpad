package com.smartdroid.ArrayListChallenge;

// https://coderanch.com/t/271631/java/Multidimensional-ArrayList

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printMenu();
        System.out.println("Enter your choice:");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 0:
                printMenu();
                break;
            case 1: // print the list
                mobilePhone.printList();
                break;
            case 2:
                addContacts();
                break;
            case 3:
                updateContacts();
                break;
            case 4:
                removeContacts();
                break;
            case 5:
                //searchContacts();
                break;
            case 6:
                quit = true;
                break;

        }
    }

        public static void printMenu() {
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To print the list of contacts.");
            System.out.println("\t 2 - To add a contact to the list.");
            System.out.println("\t 3 - To modify a contact in the list.");
            System.out.println("\t 4 - To remove a contact from the list.");
            System.out.println("\t 5 - To search for a contact in the list.");
            System.out.println("\t 6 - To quit the application.");
        }

        public static void addContacts() {
            System.out.println("Please enter the contact name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter phone number");
            String number = scanner.nextLine();
            Contact newContact = Contact.createContact(name, number);
            mobilePhone.addContact(scanner.nextLine());
        }

        public static void updateContacts(){
            System.out.println("Enter contact old name: ");
            String name = scanner.nextLine();
            System.out.println("Enter new name");
            String newContact = scanner.nextLine();
            mobilePhone.updateContact(newContact);
        }

        public static void removeContacts() {
            System.out.println("Enter the contact to remove: ");
            String name = scanner.nextLine();
            mobilePhone.removeContact(name);
        }




}