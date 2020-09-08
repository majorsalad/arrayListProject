package com.majorsalad;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void printContacts(){
        System.out.println("You have " + contactList.size() + " contacts in your phone!");
        for(int i = 0; i < contactList.size(); i++){
            int displayNum = i + 1;
            System.out.println("[" + displayNum + "] Name: " + contactList.get(i).getName());
            System.out.println("Phone Number: " + contactList.get(i).getPhoneNumber());
        }
    }

    public void addContact(Contact newEntry){
//            int indexNum = findIndex(newEntry);
//            if(indexNum >= 0){
                contactList.add(newEntry);
//            } else {
//                System.out.println("Contact already exists.");
//            }
    }


    public void modifyContact(int pos, Contact updatedEntry){
            contactList.set(pos, updatedEntry);
    }

    public void deleteContact(int pos){
            contactList.remove(pos);
    }

    public int findIndex(Contact contact){
        return contactList.indexOf(contact);
    }

    public boolean searchContact(String name){
            for(int i = 0; i < contactList.size(); i++){
                if(name.equals(contactList.get(i).getName())){
                    return true;
                }
            }
            return false;
    }


}
