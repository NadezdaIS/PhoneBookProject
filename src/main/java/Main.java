import phonebook.PhonebookController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhonebookController phonebookController = new PhonebookController();

        Scanner scanner = new Scanner(System.in);
        String userInput  = "";

        while (!userInput.equals("6")){
            phonebookController.displayMenu();
            userInput = scanner.nextLine();

            switch (userInput){
                case "1":
                    phonebookController.collectAndSaveContact();
                    break;
                case "2":
                    phonebookController.removeContact();
                    break;
                case "3":
                    phonebookController.updateContact();
                    break;
                case "4":
                    phonebookController.findContact();
                    break;
                case "5":
                    phonebookController.showAllContacts(null);
                    break;
                case "6":
                    System.out.println("Good  bye!");
                    break;
                default:
                    System.out.println("Please enter a menu option that is supported");
            }
        }

        System.exit(0);
    }
}

