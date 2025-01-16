package restaurant;
import java.util.Scanner;

/*
 * author: Maria Alampay
 * date: 13/01/2025
 * Menu class 
 */

public class Menu {
    public static void showMenu(){
        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        String juiceChoice = "Juice";
        String alcoholChoice = "Alcohol";
        String sodaChoice = "Soda";
        String iceCreamChoice = "Ice Cream";
        
        //TODO: add price to the end of the cases and to the prints above^^
        //appetizers
        System.out.println("---The Ivory Lounge Menu---");
        System.out.println("Appetizers:");
        System.out.println("-------------------");
        System.out.println("[1] Garden Salad - contains chicken, tomatoes, cucumbers, read onions. $15.65");
        System.out.println("[2] Pan seared Scallops - $19.89");
        System.out.println("[3] Quail Eggs Benedict - $16.55");
        System.out.println("[4] Tuna Tartare - $19.20");
        System.out.print("Select an appetizer (1-4): ");
        String appetizers = input.nextLine();
        switch (appetizers) {
            case "1": 
                System.out.println("You selected Garden Salad.");
                totalPrice += 15.65;
                break;
            case "2":
                System.out.println("You selected Pan Seared Scallops.");
                totalPrice += 19.89;
                break;
            case "3":
                System.out.println("You selected Quail Eggs Benedict.");
                totalPrice += 16.55;
                break;
            case "4":
                System.out.println("You selected Tuna Tartare.");
                totalPrice += 19.20;
                break;
            default:
                System.out.println("Invalid appetizer selection.");
        }

        //drinks
        System.out.println("Drinks:");
        System.out.println("-------------------");
        System.out.println("[1] Water - $0.00");
        System.out.println("[2] Soda - $1.50");
        System.out.println("[3] Juice - $1.20");
        System.out.println("[4] Alcohol - *prices vary*");
        System.out.print("Select a drink (1-4): ");
        String drinks = input.nextLine();
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
                        totalPrice += 1.50;
                    } else if (sodaChoice.equals("2")) {
                        System.out.println("You selected Sprite.");
                        totalPrice += 1.50;
                    } else if (sodaChoice.equals("3")) {
                        System.out.println("You selected Crush.");
                        totalPrice += 1.50;                    
                    } else if (sodaChoice.equals("4")) {
                        System.out.println("You selected Coke Cola.");
                        totalPrice += 1.50;
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
                        totalPrice += 1.20;
                    } else if (juiceChoice.equals("2")) {
                        System.out.println("You selected Mango.");
                        totalPrice += 1.20;
                    } else if (juiceChoice.equals("3")) {
                        System.out.println("You selected Apple.");
                        totalPrice += 1.20;
                    } else if (juiceChoice.equals("4")) {
                        System.out.println("You selected Fruit punch.");
                        totalPrice += 1.20;
                    } else {
                        System.out.println("Invalid juice choice.");
                    }
                break;
                
            case "4":
                System.out.println("You selected Alcohol.");
                System.out.print("Enter your age: ");
                int age = input.nextInt();
                input.nextLine(); // flush buffer
                if (age >= 19) {
                    System.out.println("Please select a Alcoholic beverage:");
                    System.out.println("[1] Wine");
                    System.out.println("[2] Champagne");
                    System.out.println("[3] Whisky");
                    System.out.println("[4] Cocktail"); 
                    alcoholChoice = input.nextLine();
                        if (alcoholChoice.equals("1")) {
                            System.out.println("You selected Wine.");
                            totalPrice += 26.47;
                        } else if (alcoholChoice.equals("2")) {
                            System.out.println("You selected Champagne.");
                            totalPrice += 25.88;
                        } else if (alcoholChoice.equals("3")) {
                            System.out.println("You selected Whisky.");
                            totalPrice += 29.63;
                        } else if (alcoholChoice.equals("4")) {
                            System.out.println("You selected Cocktail.");
                            totalPrice += 18.12;
                        } else {
                            System.out.println("Invalid alcohol choice.");
                        }
                } else {
                    System.out.println("Sorry, you must be at least 19 years old to order alcohol.");
                }
                break;
            }
        

        //entrée
        System.out.println("Entrées:");
        System.out.println("-------------------");
        System.out.println("[1] Pan seared Salmon - $34.13");
        System.out.println("[2] Truffle Carbonara - $35.33");
        System.out.println("[3] Pan seared Filet Mignon and Butter Poached Lobster - $42.97");
        System.out.println("[4] Spicy Shrimp with rice - $30.42");
        System.out.print("Select an entrée (1-4): ");
        String entrée = input.nextLine();
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

        //desserts
        System.out.println("Desserts:");
        System.out.println("-------------------");
        System.out.println("[1] Chocolate Lava Cake - $15.50");
        System.out.println("[2] Chocolate Soufflé - $17.10");
        System.out.println("[3] Creme Brulee - $12.75");
        System.out.println("[4] Ice Cream - $8.10");
        System.out.print("Select a dessert (1-4): ");
        String desserts = input.nextLine(); 
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
                System.out.println("[1] Earl Grey");
                System.out.println("[2] Peach Basil");
                System.out.println("[3] Matcha Green Tea");
                System.out.println("[4] Roasted Pistachio"); 
                iceCreamChoice = input.nextLine();
                    if (iceCreamChoice.equals("1")) {
                        System.out.println("You selected Earl Grey.");
                        totalPrice += 8.10;
                    } else if (iceCreamChoice.equals("2")) {
                        System.out.println("You selected Peach Basil.");
                        totalPrice += 8.10;
                    } else if (iceCreamChoice.equals("3")) {
                        System.out.println("You selected Matcha Green Tea.");
                        totalPrice += 8.10;
                    } else if (iceCreamChoice.equals("4")) {
                        System.out.println("You selected Roasted Pistachio.");
                        totalPrice += 8.10;
                    } else {
                        System.out.println("Invalid alcohol choice.");
                    }

            break;
    
            //System.out.println("You are ordering: " + appetizers + drinks + entrée + desserts + ".");
            //System.out.println("Total Price: $" + totalPrice);
            }
        }
        
        
    }