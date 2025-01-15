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
        double totalPrice = 0;
        //System.out.print("Enter your age: ");
        int age = input.nextInt(); 
        String juiceChoice = "Juice";
        String alcoholChoice = "Alcohol";
        String sodaChoice = "Soda";
        String iceCreamChoice = "Ice Cream";
        
        //when i run the code it stops at "Select an appetizer (1-4):" and the code stops so i need to fix this tommorow
        //update, i fixed some things and now when i run my code it outputs the question about age for the alcohol. then it will output the menu in a very ugly way (ill fix the formatting later since its just syso and a bunch of extra lines and what not) then it will say "Select an appetizer(1-4)" and ask for the drink on the same line. it also duplicated the errors
        //i see bugs coming from the switch/case i have inside the main switch/cases ex. the ice cream
        //update 2: my code doesnt output the question about age anymore since i removed it from the top and left it at the switch/case for the alcohol but it has an empty line when i press enter and doesnt output the menu properly
        //it doesnt let me enter an age for the alcohol and the switch case for that doesnt work as id like it do

        //appetizers
        System.out.println("[1] Garden Salad - contains chicken, tomatoes, cucumbers, read onions. $13.65");
        System.out.println("[2] Pan seared Scallops");
        System.out.println("[3] Quail Eggs Benedict ");
        System.out.println("[4] Tuna Tartare");
        System.out.print("Select an appetizer (1-4): ");
        String appetizers = input.nextLine();

        //drinks
        System.out.println("[1] Water");
        System.out.println("[2] Soda");
        System.out.println("[3] Juice");
        System.out.println("[4] Alcohol");
        System.out.print("Select a drink (1-4): ");
        String drinks = input.nextLine();

        //entrée
        System.out.println("[1] Pan seared Salmon");
        System.out.println("[2] Truffle Carbonara");
        System.out.println("[3] Pan seared Filet Mignon and Butter Poached Lobster");
        System.out.println("[4] Spicy Shrimp with rice");
        System.out.print("Select an entrée (1-4): ");
        String entrée = input.nextLine();

        //desserts
        System.out.println("[1] Chocolate Lava Cake");
        System.out.println("[2] Chocolate Soufflé");
        System.out.println("[3] Creme Brulee");
        System.out.println("[4] Ice Cream");
        System.out.print("Select a dessert (1-4): ");
        String desserts = input.nextLine();

        //TODO: add price to the end of the cases and to the prints above^^
        switch (appetizers) {
            case "1": 
                System.out.println("You selected Garden Salad.");
                totalPrice += 13.65;
                break;
            case "2":
                System.out.println("You selected Pan Seared Scallops.");
                totalPrice += 13.65;
                break;
            case "3":
                System.out.println("You selected Quail Eggs Benedict.");
                totalPrice += 13.65;
                break;
            case "4":
                System.out.println("You selected Tuna Tartare.");
                totalPrice += 13.65;
                break;
            default:
                System.out.println("Invalid appetizer selection.");
        }

        switch (drinks) {
            case "1":
            System.out.println("You selected Water.");
            totalPrice += 0;
                break;
            case "2":
            System.out.println("You selected Soda.");
            System.out.println("Please select a soda flavor:");
                System.out.println("[1] Ice Tea");
                System.out.println("[2] Sprite");
                System.out.println("[3] Crush");
                System.out.println("[4] Coke Cola"); 
                //String sodaChoice = input.nextLine();
                switch (sodaChoice) {
                    case "1":
                        System.out.println("You selected Ice Tea.");
                        break;
                    case "2":
                        System.out.println("You selected Sprite.");
                        break;
                    case "3":
                        System.out.println("You selected Crush.");
                        break;
                    case "4":
                        System.out.println("You selected Coke Cola.");
            totalPrice += 2.35;
                break;
                }
            case "3":
            System.out.println("You selected Juice.");
                System.out.println("Please select a juice flavor:");
                System.out.println("[1] Orange");
                System.out.println("[2] Mango");
                System.out.println("[3] Apple");
                System.out.println("[4] Fruit punch"); 
                //String juiceChoice = input.nextLine();
                switch (juiceChoice) {
                    case "1":
                        System.out.println("You selected Orange.");
                        break;
                    case "2":
                        System.out.println("You selected Mango.");
                        break;
                    case "3":
                        System.out.println("You selected Apple.");
                        break;
                    case "4":
                        System.out.println("You selected Fruit punch.");
            totalPrice += 1.50;
                break;
                }
            case "4":
                //figure out how to do switch case inside with the if statements
                System.out.print("Enter your age: "); 
            if (age >= 19) {
                System.out.println("You selected Alcohol.");
                System.out.println("Please select a Alcoholic beverage:");
                System.out.println("[1] Wine");
                System.out.println("[2] Champagne");
                System.out.println("[3] Whisky");
                System.out.println("[4] Cocktail"); 
                //String juiceChoice = input.nextLine();
                switch (alcoholChoice) {
                    case "1":
                        System.out.println("You selected Wine.");
                        break;
                    case "2":
                        System.out.println("You selected Champagne.");
                        break;
                    case "3":
                        System.out.println("You selected Whisky.");
                        break;
                    case "4":
                        System.out.println("You selected Cocktail.");
            totalPrice += 13.65;
                break;
                }
            } else {
                System.out.println("Sorry, you must be at least 19 years old to order alcohol.");
            }   break;
            default:
                System.out.println("Invalid drink selection.");
            }

            switch (entrée) {
                case "1":
                System.out.println("You selected Pan seared Salmon.");
                totalPrice += 13.65;
                    break;
                case "2":
                System.out.println("You selected Truffle Carbonara.");
                totalPrice += 13.65;
                    break;
                case "3":
                System.out.println("You selected Pan seared Filet Mignon and Butter Poached Lobster.");
                totalPrice += 13.65;
                    break;
                case "4":
                System.out.println("You selected Spicy Shrimp with rice.");
                totalPrice += 13.65;
                    break;
                default:
                    System.out.println("Invalid entrée selection.");
            }
    
            switch (desserts) {
                case "1":
                System.out.println("You selected Chocolate Lava Cake.");
                totalPrice += 13.65;
                    break;
                case "2":
                System.out.println("You selected Chocolate Soufflé.");
                totalPrice += 13.65;
                    break;
                case "3":
                System.out.println("You selected Creme Brulee.");
                totalPrice += 13.65;
                    break;
                case "4": 
                    // Inside switch for ice cream choice
                    //gpty showed me how to do the switch case inside the main switch case
                    System.out.println("You selected Ice Cream.");
                    System.out.println("Please select an ice cream flavor:");
                    System.out.println("[1] Vanilla");
                    System.out.println("[2] Chocolate");
                    System.out.println("[3] Strawberry");
                    System.out.println("[4] Mint"); 
                    //String icecreameChoice = input.nextLine();
                    switch (iceCreamChoice) {
                        case "1":
                            System.out.println("You selected Vanilla Ice Cream.");
                            break;
                        case "2":
                            System.out.println("You selected Chocolate Ice Cream.");
                            break;
                        case "3":
                            System.out.println("You selected Strawberry Ice Cream.");
                            break;
                        case "4":
                            System.out.println("You selected Mint Ice Cream.");
                totalPrice += 13.65;
                    break;
                default:
                    System.out.println("Invalid dessert selection.");
                    }
    
            System.out.println("You are ordering: " + appetizers + drinks + entrée + desserts + ".");
            System.out.println("Total Price: $" + totalPrice);
            }
        }
        
        
    }