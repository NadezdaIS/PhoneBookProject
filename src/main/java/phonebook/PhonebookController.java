package phonebook;

import java.util.Scanner;

public class PhonebookController {
    private Scanner scanner = new Scanner(System.in);
    private StorageManager storageManager = new StorageManager();

    public void collectAndSaveContact() {
        try {
            this.storageManager.addContact(this.collectContactInfo());
            System.out.println("Contact Added successfully");
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }

    private Contact collectContactInfo() {
        Contact contact = new Contact();

        System.out.println("Enter First Name: ");
        contact.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name: ");
        contact.setLastName(scanner.nextLine());
        System.out.println("Enter Phone Number: ");
        contact.setPhoneNumber(scanner.nextLine());
        return contact;
    }

    public void displayMenu(){
        System.out.println("Welcome to Phonebook!" +
                "\n1. Add Contact" +
                "\n2. Remove Contact" +
                "\n3. Update Contact" +
                "\n4. Find Contact" +
                "\n5. View All Contacts" +
                "\n6. Exit");
    }


}

