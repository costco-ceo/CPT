package restaurant;

/*
 * author: Maria Alampay
 * date: 13/01/2025
 * Menu class 
 */

import java.util.Scanner;

public class Menu {
    public static void showMenu(){
        Scanner input = new Scanner(System.in);
        String sodaChoice = "Soda";
        String alcoholChoice = "Alcohol";
        double totalPrice = 0;
        System.out.print("Enter your age: ");
        int age = input.nextInt();
    
        
        //appetizers
        System.out.println("[1] Garden Salad - contains chicken, tomatoes, cucumbers, read onions. $13.65");
        System.out.println("[2] Pan seared Scallops - pea purée");
        System.out.println("[3] Quail Eggs Benedict - contains");
        System.out.println("[4] Tuna Tartare");
        //drinks
        System.out.println("[1] Water");
        System.out.println("[2] Soda");
        System.out.println("[3] Juice");
        System.out.println("[4] Alcohol");
        //entrée
        System.out.println("[1] Pan seared Salmon - contains");
        System.out.println("[2] Truffle Carbonara - contains");
        System.out.println("[3] Pan seared Filet Mignon and Butter Poached Lobster - contains");
        System.out.println("[4] Spicy Shrimp with rice - contains ");
        //desserts
        System.out.println("[1] Chocolate Lava Cake");
        System.out.println("[2] Chocolate Soufflé");
        System.out.println("[3] Creme Brulee");
        System.out.println("[4] Ice Cream");

        System.out.print("Select an appetizer (1-4): ");
        String appetizers = input.nextLine();

        System.out.print("Select a drink (1-4): ");
        String drinks = input.nextLine();

        System.out.print("Select an entrée (1-4): ");
        String entrée = input.nextLine();

        System.out.print("Select a dessert (1-4): ");
        String desserts = input.nextLine();

        //TODO: add price to the end of the cases
        switch (appetizers) {
            case "1": 
                System.out.println("You selected Garden Salad.");
                totalPrice += 13.65;
                break;
            case "2":
                System.out.println("You selected Pan Seared Scallops.");
                break;
            case "3":
                System.out.println("You selected Quail Eggs Benedict.");
                break;
            case "4":
                System.out.println("You selected Tuna Tartare.");
                break;
            default:
                System.out.println("Invalid appetizer selection.");
        }

        switch (drinks) {
            case "1":
            System.out.println("You selected Water.");
                break;
                //switch(sodaChoice){}
            case "2":
            System.out.println("You selected Soda.");
                break;
            case "3":
            System.out.println("You selected Juice.");
                break;
                //switch(alcoholChoice){}
            case "4":
            System.out.println("You selected Alcohol.");
            if (age >= 19) {
                System.out.println("You selected Alcohol.");
            } else {
                System.out.println("Sorry, you must be at least 19 years old to order alcohol.");
            }   break;
            default:
                System.out.println("Invalid drink selection.");
        }
        
        switch (entrée) {
            case "1":
            System.out.println("You selected Pan seared Salmon.");
                break;
            case "2":
            System.out.println("You selected Truffle Carbonara.");
                break;
            case "3":
            System.out.println("You selected Pan seared Filet Mignon and Butter Poached Lobster.");
                break;
            case "4":
            System.out.println("You selected Spicy Shrimp with rice.");
                break;
            default:
                System.out.println("Invalid entrée selection.");
        }

        switch (desserts) {
            case "1":
            System.out.println("You selected Chocolate Lava Cake.");
                break;
            case "2":
            System.out.println("You selected Chocolate Soufflé.");
                break;
            case "3":
            System.out.println("You selected Creme Brulee.");
                break;
            //switch(icecreameChoice)
            case "4": 
            System.out.println("You selected Ice Cream.");
                break;
            default:
                System.out.println("Invalid dessert selection.");
        }

        System.out.println("You are ordering: " + appetizers + drinks + entrée + desserts + ".");
    }
}
