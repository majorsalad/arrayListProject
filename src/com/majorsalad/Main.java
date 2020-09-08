package com.majorsalad;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    phone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to your phone.");
        System.out.println("\t 3 - To modify an contact on the phone.");
        System.out.println("\t 4 - To remove an contact from the phone.");
        System.out.println("\t 5 - To search for an contact on the phone.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact() {

        System.out.print("Please enter the contact name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the phone number: ");
        String number = scanner.nextLine();
        Contact newContact = new Contact(name, number);
        phone.addContact(newContact);

    }

    public static void modifyContact() {
        phone.printContacts();
        System.out.println("Please enter the position of the contact you wish to edit (the number next to each name): ");
        int position = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println("Please enter the edited contact name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the edited phone number: ");
        String number = scanner.nextLine();
        Contact updatedContact = new Contact(name, number);
        phone.modifyContact(position, updatedContact);

    }

    public static void removeContact() {
        phone.printContacts();
        System.out.println("To delete please enter the contact position (the number next to each name): ");
        phone.deleteContact(scanner.nextInt() - 1);
    }

    public static void searchForContact(){
        System.out.println("Enter the name you are searching for: ");
        if(phone.searchContact(scanner.nextLine())){
            System.out.println("Contact found in contact list.");
        } else {
            System.out.println("Contact not found in list.");
        }
    }


}
