package com.smartdroid;

import java.util.ArrayList;

public class ArrayListScratchpad {

    private ArrayList<String> listOfString = new ArrayList<>();


    public ArrayList<String> getListOfString() {
        return listOfString;
    }

    public void addItemToList(String item) {
        listOfString.add(item);
    }

    public void printItem() {
        System.out.println("You have " + listOfString.size() + " items in your list");
        for (int i = 0; i < listOfString.size(); i++) {
            System.out.println((i + 1) + ". " + listOfString.get(i));

        }
    }

    public void replaceItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            replaceItem(position, newItem);
        }

    }

    private void replaceItem(int position, String item) {
        listOfString.set(position, item);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeItem(position);
        }
    }


    private void removeItem(int position) {
        listOfString.remove(position);
    }

    private int findItem(String searchItem) {
        return listOfString.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }
}
