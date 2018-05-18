package com.smartdroid;

import java.util.ArrayList;

public class ArrayListScratchpad {

    private ArrayList<String> listOfString = new ArrayList<>();


    public void addItemToList(String item){
        listOfString.add(item);
    }

    public void printItem (){
        System.out.println("You have " + listOfString.size() + " items in your list");
        for (int i = 0; i <listOfString.size() ; i++) {
            System.out.println((i+1) + ". " + listOfString.get(i));

        }
    }

    public void replaceItem(int position, String item){
        listOfString.set(position, item);
            System.out.println("Grocery item " + (position+1) + " has been modified.");
        System.out.println("New list of items:");
        for (int i = 0; i <listOfString.size() ; i++) {
            System.out.println((i+1) + ". " + listOfString.get(i));

        }
    }

    public void removeItem(int position) {
        String theItem = listOfString.get(position);
        listOfString.remove(position);
    }

    public String findItem(String searchItem){
        int position = listOfString.indexOf(searchItem);
        if (position >=0){
            return listOfString.get(position);
        }
        return null;
    }
}
