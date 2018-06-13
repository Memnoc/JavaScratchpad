package com.smartdroid.ArrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactList;
    private String number;

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public String getNumber() {
        return number;
    }

    public String addContact(String name) {
        addContact(name);
        return name;
    }


    private boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public int findContact(String contactName) {
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact) {
        return contactList.indexOf(contact);

    }

    public Contact removeContact(String name) {
        int position = findContact(name);
        if (position>=0){
            return this.contactList.get(position);
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            contactList.remove(contact);
            return true;
        }
        System.out.println("Contact does not exists");
        return false;
    }

    public Contact updateContact(String name) {
        int position = findContact(name);
        if (position>=0){
            return this.contactList.get(position);
        }
        return null;
    }

    private boolean updateContact(Contact oldName, Contact newName) {
        int position = findContact(oldName);
        if (position<0){
            System.out.println(oldName + " does not exists");
            return false;
        }
        contactList.set(position, newName);
        System.out.println("Contact at index " + position + oldName.getName() + " has been replaced by " + newName.getName());
        return true;
    }

    public void printList() {
        System.out.println("Contacts on phone: " + contactList.size());
        for (int i = 0; i <contactList.size() ; i++) {
            System.out.println((i+1) + ". " + contactList.get(i));
        }
    }
}
