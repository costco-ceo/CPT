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
        //int age = input.nextInt();
        //input.nextLine();  // Flush buffer
        String juiceChoice = "Juice";
        String alcoholChoice = "Alcohol";
        String sodaChoice = "Soda";
        String iceCreamChoice = "Ice Cream";
        
        //new updates: the menu and whatnot is running fine now but I need to fix the if statements under the switch/case 

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
                sodaChoice = input.nextLine();
                    if (sodaChoice.equals("1")) {
                        System.out.println("You selected Ice Tea.");
                    } else if (sodaChoice.equals("2")) {
                        System.out.println("You selected Sprite.");
                    } else if (sodaChoice.equals("3")) {
                        System.out.println("You selected Crush.");
                    } else if (sodaChoice.equals("4")) {
                        System.out.println("You selected Coke Cola.");
                        //totalPrice += 13.65;
                    } else {
                        System.out.println("Invalid soda choice.");
                    }
                break;
            
            case "3":
                System.out.println("You selected Juice.");
                System.out.println("Please select a juice flavor:");
                System.out.println("[1] Orange");
                System.out.println("[2] Mango");
                System.out.println("[3] Apple");
                System.out.println("[4] Fruit punch"); 
                juiceChoice = input.nextLine();
                    if (juiceChoice.equals("1")) {
                        System.out.println("You selected Orange.");
                    } else if (juiceChoice.equals("2")) {
                        System.out.println("You selected Mango.");
                    } else if (juiceChoice.equals("3")) {
                        System.out.println("You selected Apple.");
                    } else if (juiceChoice.equals("4")) {
                        System.out.println("You selected Fruit punch.");
                        totalPrice += 13.65;
                    } else {
                        System.out.println("Invalid juice choice.");
                    }
                break;
                
            case "4":
                System.out.println("You selected Alcohol.");
                System.out.print("Enter your age: ");
                int age = input.nextInt();
                input.nextLine(); // flush 
                if (age >= 19) {
                    System.out.println("Please select a Alcoholic beverage:");
                    System.out.println("[1] Wine");
                    System.out.println("[2] Champagne");
                    System.out.println("[3] Whisky");
                    System.out.println("[4] Cocktail"); 
                    alcoholChoice = input.nextLine();
                        if (alcoholChoice.equals("1")) {
                            System.out.println("You selected Wine.");
                        } else if (alcoholChoice.equals("2")) {
                            System.out.println("You selected Champagne.");
                        } else if (alcoholChoice.equals("3")) {
                            System.out.println("You selected Whisky.");
                        } else if (alcoholChoice.equals("4")) {
                            System.out.println("You selected Cocktail.");
                            totalPrice += 13.65;
                        } else {
                            System.out.println("Invalid alcohol choice.");
                        }
                } else {
                    System.out.println("Sorry, you must be at least 19 years old to order alcohol.");
                }
                break;
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
                break;
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
                System.out.println("You selected Ice Cream.");
                System.out.println("Please select an ice cream flavor:");
                System.out.println("[1] Vanilla");
                System.out.println("[2] Chocolate");
                System.out.println("[3] Matcha");
                System.out.println("[4] Mint"); 
                iceCreamChoice = input.nextLine();
                    if (iceCreamChoice.equals("1")) {
                        System.out.println("You selected Vanilla.");
                    } else if (iceCreamChoice.equals("2")) {
                        System.out.println("You selected Chocolate.");
                    } else if (iceCreamChoice.equals("3")) {
                        System.out.println("You selected Matcha.");
                    } else if (iceCreamChoice.equals("4")) {
                        System.out.println("You selected Mint.");
                        totalPrice += 13.65;
                    } else {
                        System.out.println("Invalid alcohol choice.");
                    }

            break;
    
            //System.out.println("You are ordering: " + appetizers + drinks + entrée + desserts + ".");
            //System.out.println("Total Price: $" + totalPrice);
            }
        }
        
        
    }