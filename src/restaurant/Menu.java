package restaurant;
import java.util.Scanner;

/*
 * author: Maria Alampay
 * date: 13/01/2025
 * Menu class 
 */

public class Menu {
    // ANSI escape codes for colors (I found this all on google)
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void showMenu(){
        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        String appetizers = "Appetizers";
        String drinks = "Drinks";
        String entrée = "Entrée";
        String desserts = "Desserts";
        String juiceChoice = "Juice";
        String alcoholChoice = "Alcohol";
        String sodaChoice = "Soda";
        String iceCreamChoice = "Ice Cream";
        String appetizerChoice = "Appetizer";
        String drinkChoice = "Drink";
        String entréeChoice = "Entrée";
        String dessertChoice = "Dessert";
        
        //TODO: make sure all prices are correct for this to output proper total price

        //appetizers
        System.out.println(ANSI_CYAN + "|The Ivory Lounge Menu|" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Appetizers:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-------------------" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "[1] Garden Salad - contains chicken, tomatoes, cucumbers, read onions. $15.65" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "[2] Pan seared Scallops - $19.89" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "[3] Quail Eggs Benedict - $16.55" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "[4] Tuna Tartare - $19.20" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Select an appetizer (1-4): "+ ANSI_RESET);
        appetizers = input.nextLine();
        switch (appetizers) {
            case "1": 
                System.out.println(ANSI_RED + "You selected Garden Salad." + ANSI_RESET);
                totalPrice += 15.65;
                break;
            case "2":
                System.out.println(ANSI_RED + "You selected Pan Seared Scallops." + ANSI_RESET);
                totalPrice += 19.89;
                break;
            case "3":
                System.out.println(ANSI_RED + "You selected Quail Eggs Benedict." + ANSI_RESET);
                totalPrice += 16.55;
                break;
            case "4":
                System.out.println(ANSI_RED + "You selected Tuna Tartare." + ANSI_RESET);
                totalPrice += 19.20;
                break;
            default:
                System.out.println(ANSI_RED + "Invalid appetizer selection." + ANSI_RESET);
        }

        //drinks
        System.out.println(ANSI_YELLOW + "Drinks:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-------------------" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "[1] Water - $0.00" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "[2] Soda - $1.50" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "[3] Juice - $1.20" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "[4] Alcohol - *prices vary*" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Select a drink (1-4): " + ANSI_RESET);
        drinks = input.nextLine();
        switch (drinks) {
            case "1":
                System.out.println(ANSI_RED + "You selected Water." + ANSI_RESET);
                totalPrice += 0;
                break;
            case "2":
                System.out.println(ANSI_RED + "You selected Soda." + ANSI_RESET);
                System.out.println(ANSI_GREEN + "Please select a soda flavor:" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "[1] Ice Tea" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "[2] Sprite" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "[3] Crush" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "[4] Coke Cola" + ANSI_RESET); 
                /**
                 * @param sodaChoice
                 */
                sodaChoice = input.nextLine();
                    if (sodaChoice.equals("1")) {
                        System.out.println(ANSI_RED + "You selected Ice Tea." + ANSI_RESET);
                        totalPrice += 1.50;
                    } else if (sodaChoice.equals("2")) {
                        System.out.println(ANSI_RED + "You selected Sprite." + ANSI_RESET);
                        totalPrice += 1.50;
                    } else if (sodaChoice.equals("3")) {
                        System.out.println(ANSI_RED + "You selected Crush." + ANSI_RESET) ;
                        totalPrice += 1.50;                    
                    } else if (sodaChoice.equals("4")) {
                        System.out.println(ANSI_RED + "You selected Coke Cola." + ANSI_RESET);
                        totalPrice += 1.50;
                    } else {
                        System.out.println(ANSI_RED +"Invalid soda choice." + ANSI_RESET);
                    }
                break;
            
            case "3":
                System.out.println(ANSI_RED + "You selected Juice." + ANSI_RESET);
                System.out.println(ANSI_GREEN + "Please select a juice flavor:" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "[1] Orange" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "[2] Mango" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "[3] Apple" + ANSI_RESET);
                System.out.println(ANSI_GREEN + "[4] Fruit punch" + ANSI_RESET); 
                juiceChoice = input.nextLine();
                    if (juiceChoice.equals("1")) {
                        System.out.println(ANSI_RED + "You selected Orange." + ANSI_RESET);
                        totalPrice += 1.20;
                    } else if (juiceChoice.equals("2")) {
                        System.out.println(ANSI_RED +"You selected Mango." + ANSI_RESET) ;
                        totalPrice += 1.20;
                    } else if (juiceChoice.equals("3")) {
                        System.out.println(ANSI_RED + "You selected Apple." + ANSI_RESET);
                        totalPrice += 1.20;
                    } else if (juiceChoice.equals("4")) {
                        System.out.println(ANSI_RED + "You selected Fruit punch." + ANSI_RESET);
                        totalPrice += 1.20;
                    } else {
                        System.out.println(ANSI_RED + "Invalid juice choice." + ANSI_RESET);
                    }
                break;
                
            case "4":
                System.out.println(ANSI_GREEN + "You selected Alcohol." + ANSI_RESET);
                System.out.print(ANSI_RED + "Enter your age: " + ANSI_RESET);
                int age = input.nextInt();
                input.nextLine(); // flush buffer
                if (age >= 19) {
                    System.out.println(ANSI_RED + "Please select an Alcoholic beverage:" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "[1] Wine" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "[2] Champagne" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "[3] Whisky" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "[4] Cocktail" + ANSI_RESET); 
                    alcoholChoice = input.nextLine();
                        if (alcoholChoice.equals("1")) {
                            System.out.println(ANSI_RED +"You selected Wine." + ANSI_RESET);
                            totalPrice += 26.47;
                        } else if (alcoholChoice.equals("2")) {
                            System.out.println(ANSI_RED + "You selected Champagne." + ANSI_RESET);
                            totalPrice += 25.88;
                        } else if (alcoholChoice.equals("3")) {
                            System.out.println(ANSI_RED + "You selected Whisky." + ANSI_RESET);
                            totalPrice += 29.63;
                        } else if (alcoholChoice.equals("4")) {
                            System.out.println(ANSI_RED + "You selected Cocktail." + ANSI_RESET);
                            totalPrice += 18.12;
                        } else {
                            System.out.println(ANSI_RED + "Invalid alcohol choice." + ANSI_RESET);
                        }
                    } else {
                    System.out.println(ANSI_RED +"Invalid age entered. Please re-enter your drink choice." + ANSI_RESET);
                    System.out.print(ANSI_YELLOW + "Select a drink (1-4): " + ANSI_RESET);
                    drinks = input.nextLine();
                    // Repeat the drink selection switch case
                    switch (drinks) {
                        case "1":
                            System.out.println(ANSI_RED + "You selected Water." + ANSI_RESET);
                            totalPrice += 0;
                            break;
                        case "2":
                            System.out.println(ANSI_RED + "You selected Soda."+ ANSI_RESET);
                            System.out.println(ANSI_GREEN + "Please select a soda flavor:" + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "[1] Ice Tea" + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "[2] Sprite" + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "[3] Crush" + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "[4] Coke Cola" + ANSI_RESET); 
                            sodaChoice = input.nextLine();
                                if (sodaChoice.equals("1")) {
                                    System.out.println(ANSI_RED + "You selected Ice Tea." + ANSI_RESET);
                                    totalPrice += 1.50;
                                } else if (sodaChoice.equals("2")) {
                                    System.out.println(ANSI_RED + "You selected Sprite." + ANSI_RESET);
                                    totalPrice += 1.50;
                                } else if (sodaChoice.equals("3")) {
                                    System.out.println(ANSI_RED + "You selected Crush." + ANSI_RESET);
                                    totalPrice += 1.50;                    
                                } else if (sodaChoice.equals("4")) {
                                    System.out.println(ANSI_RED + "You selected Coke Cola." + ANSI_RESET);
                                    totalPrice += 1.50;
                                } else {
                                    System.out.println(ANSI_RED + "Invalid soda choice." + ANSI_RESET);
                                }
                            break;
                        case "3":
                            System.out.println(ANSI_RED + "You selected Juice." + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "Please select a juice flavor:" + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "[1] Orange" + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "[2] Mango" + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "[3] Apple" + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "[4] Fruit punch" + ANSI_RESET); 
                            juiceChoice = input.nextLine();
                                if (juiceChoice.equals("1")) {
                                    System.out.println(ANSI_RED + "You selected Orange." + ANSI_RESET);
                                    totalPrice += 1.20;
                                } else if (juiceChoice.equals("2")) {
                                    System.out.println(ANSI_RED + "You selected Mango." + ANSI_RESET);
                                    totalPrice += 1.20;
                                } else if (juiceChoice.equals("3")) {
                                    System.out.println(ANSI_RED + "You selected Apple." + ANSI_RESET);
                                    totalPrice += 1.20;
                                } else if (juiceChoice.equals("4")) {
                                    System.out.println(ANSI_RED + "You selected Fruit punch." + ANSI_RESET);
                                    totalPrice += 1.20;
                                } else {
                                    System.out.println(ANSI_RED + "Invalid juice choice." + ANSI_RESET);
                                }
                            break;
                        case "4":
                            System.out.println(ANSI_RED + "You selected Alcohol." + ANSI_RESET);
                            System.out.print(ANSI_GREEN + "Enter your age: " + ANSI_RESET);
                            age = input.nextInt();
                            input.nextLine(); // flush buffer
                            while(age < 19){
                                System.out.println(ANSI_RED + "You are not of legal drinking age. Please select a different drink." + ANSI_RESET);
                                System.out.print(ANSI_GREEN + "Select a drink (1-4): " + ANSI_RESET);
                                drinks = input.nextLine();
                                if (!drinks.equals("4")) {
                                    break;
                                }
                                System.out.print(ANSI_GREEN + "Enter your age: " + ANSI_RESET);
                                age = input.nextInt();
                                input.nextLine(); // flush buffer
                            }
                        default:
                            System.out.println(ANSI_RED + "Invalid drink selection." + ANSI_RESET);
                            break;
                    }
                }
                break;
            }

        //entrée
        System.out.println(ANSI_YELLOW + "Entrées:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-------------------" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "[1] Pan seared Salmon - $34.13" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "[2] Truffle Carbonara - $35.33" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "[3] Pan seared Filet Mignon and Butter Poached Lobster - $42.97" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "[4] Spicy Shrimp with rice - $30.42" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Select an entrée (1-4): " + ANSI_RESET);
        entrée = input.nextLine();
        switch (entrée) {
            case "1":
            System.out.println(ANSI_RED + "You selected Pan seared Salmon." + ANSI_RESET);
            totalPrice += 34.13;
                break;
            case "2":
            System.out.println(ANSI_RED + "You selected Truffle Carbonara." + ANSI_RESET);
            totalPrice += 35.33;
                break;
            case "3":
            System.out.println(ANSI_RED + "You selected Pan seared Filet Mignon and Butter Poached Lobster." + ANSI_RESET);
            totalPrice += 42.97;
                break;
            case "4":
            System.out.println(ANSI_RED + "You selected Spicy Shrimp with rice." + ANSI_RESET);
            totalPrice += 30.42;
                break;
            default:
                System.out.println(ANSI_RED + "Invalid entrée selection." + ANSI_RESET);
                break;
        }

        //desserts
        System.out.println(ANSI_YELLOW + "Desserts:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-------------------" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "[1] Chocolate Lava Cake - $15.50" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "[2] Chocolate Soufflé - $17.10" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "[3] Creme Brulee - $12.75" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "[4] Ice Cream - $8.10" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Select a dessert (1-4): " + ANSI_RESET);
        desserts = input.nextLine(); 
        switch (desserts) {
            case "1":
            System.out.println(ANSI_RED + "You selected Chocolate Lava Cake." + ANSI_RESET);
            totalPrice += 15.50;
                break;
            case "2":
            System.out.println(ANSI_RED + "You selected Chocolate Soufflé." + ANSI_RESET);
            totalPrice += 17.10;
                break;
            case "3":
            System.out.println(ANSI_RED + "You selected Creme Brulee." + ANSI_RESET);
            totalPrice += 12.75;
                break;
            case "4": 
                System.out.println(ANSI_RED + "You selected Ice Cream." + ANSI_RESET);
                System.out.println(ANSI_YELLOW + "Please select an ice cream flavor:" + ANSI_RESET);
                System.out.println(ANSI_PURPLE + "[1] Earl Grey" + ANSI_RESET);
                System.out.println(ANSI_PURPLE + "[2] Peach Basil" + ANSI_RESET);
                System.out.println(ANSI_PURPLE + "[3] Matcha Green Tea" + ANSI_RESET);
                System.out.println(ANSI_PURPLE + "[4] Roasted Pistachio" + ANSI_RESET); 
                iceCreamChoice = input.nextLine();
                    if (iceCreamChoice.equals("1")) {
                        System.out.println(ANSI_RED + "You selected Earl Grey." + ANSI_RESET);
                        
                    } else if (iceCreamChoice.equals("2")) {
                        System.out.println(ANSI_RED + "You selected Peach Basil." + ANSI_RESET);
                        totalPrice += 8.10;
                    } else if (iceCreamChoice.equals("3")) {
                        System.out.println(ANSI_RED + "You selected Matcha Green Tea." + ANSI_RESET);
                        totalPrice += 8.10;
                    } else if (iceCreamChoice.equals("4")) {
                        System.out.println(ANSI_RED + "You selected Roasted Pistachio." + ANSI_RESET);
                        totalPrice += 8.10;
                    } else {
                        System.out.println(ANSI_RED + "Invalid ice cream option." + ANSI_RESET);
                        }
                    break;
                default:
                    System.out.println(ANSI_RED + "Invalid dessert selection." + ANSI_RESET);
                    break;
            }

        //create an order
        Order order = new Order();

        //add items to the order
        order.addItem(appetizers);
        order.addItem(drinks);
        order.addItem(entrée);
        order.addItem(desserts);

        //update the total price in the order
        order.setTotalPrice(totalPrice);

        //generate the ticket
        order.orderTicket();
        
        //TODO: fix this part since it outputs the numbers you chose that correspond to the menu items 
       // if you have time then try and code in coloured text
       //System.out.println(ANSI_COLORNAME + "This text is colored" + ANSI_RESET);
        }
    }