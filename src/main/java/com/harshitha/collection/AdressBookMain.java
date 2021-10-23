package com.harshitha.collection;

public class AdressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        PersonalContacts personalContacts = new PersonalContacts();
        personalContacts.setFirstName("Harshitha\n");
        personalContacts.setLastName("G\n");
        personalContacts.setAddress("Hossur\n");
        personalContacts.setCity("Chikkaballapur\n");
        personalContacts.setState("Karnataka\n");
        personalContacts.setZipCode(561210);
        personalContacts.setPhoneNumber(8296702715L);
        personalContacts.setEmail("harshithag069@gmail.com \n");
        System.out.println("Personal Contacts: " + personalContacts);
    }

}
