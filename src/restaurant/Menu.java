package restaurant;
import java.util.Scanner;

/*
 * author: Maria Alampay
 * date: 13/01/2025
 * Menu class 
 */

/**
 * The Menu class is responsible for displaying the menu to the customer
 * and handling the customer's selections.
 */

public class Menu {
    // ANSI escape codes for colors (I found this all on google)
    // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * Displays the menu to the customer and handles the customer's selections.
     */
    public static void showMenu(){
        Scanner input = new Scanner(System.in);
        double totalPrice = 0.0;
        String appetizers;
        String drinks;
        String entrée;
        String desserts;
        String juiceChoice;
        String alcoholChoice;
        String sodaChoice;
        String iceCreamChoice;

        // Appetizers
        System.out.println(ANSI_CYAN + "|The Ivory Lounge Menu|" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Appetizers:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-------------------" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "[1] Garden Salad - Contains: Chicken, tomatoes, cucumbers, read onions. $15.65" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "[2] Pan seared Scallops - Contains: Scallops, butter, olive oil, garlic, salt, pepper, lemon. $19.89" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "[3] Quail Eggs Benedict - Contains: Quail eggs, English muffin, Canadian bacon, hollandaise sauce, butter, lemon, vinegar, salt, pepper. $16.55" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "[4] Tuna Tartare - Contains: Ahi tuna, avocado, soy sauce, sesame oil, ginger, cilantro, lime, sesame seeds, cucumber, chili. $19.20" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Select an appetizer (1-4): "+ ANSI_RESET);
        appetizers = input.nextLine();
        String appetizerChoice = appetizers;
        /**
         * Switch statement to check which appetizer the user will choose
         * @param appetizers is the input that the user will choose
         */
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

        // Drinks
        System.out.println(ANSI_YELLOW + "Drinks:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-------------------" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "[1] Water - $0.00" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "[2] Soda - Ice Tea, Sprite, Crush, Coke Cola. $1.50" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "[3] Juice - Orange, Mango, Apple, Fruit Punch. $1.20" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "[4] Alcohol - Wine, Champagne, Whisky, Cocktail. *prices vary*" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Select a drink (1-4): " + ANSI_RESET);
        drinks = input.nextLine();
        String drinkChoice = drinks;
        /**
         * Switch statement to check which drinks the user will choose
         * @param drinks is the input that the user will choose
         */
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
                sodaChoice = input.nextLine();
                    /**
                    * While loop to ensure the user is of legal drinking age
                    * @param age is the input that the user will provide
                    */
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
                    /**
                    * If statement to check which kind of juice the user will choose
                    * @param juiceChoice is the input that the user will choose
                    */
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
                /**
                * If statement to check if the user is of legal drinking age
                * @param age is the input that the user will provide
                */
                if (age >= 19) {
                    System.out.println(ANSI_RED + "Please select an Alcoholic beverage:" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "[1] Wine" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "[2] Champagne" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "[3] Whisky" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "[4] Cocktail" + ANSI_RESET); 
                    alcoholChoice = input.nextLine();
                        /**
                        * If statement to check which kind of alcohol the user will choose
                        * @param alcoholChoice is the input that the user will choose
                        */
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
                                /**
                                * If statement to check which kind of soda the user will choose
                                * @param sodaChoice is the input that the user will choose
                                */
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
                                /**
                                * If statement to check which kind of juice the user will choose
                                * @param juiceChoice is the input that the user will choose
                                */
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
                            /**
                            * If statement to check which kind of soda the user will choose
                            * @param sodaChoice is the input that the user will choose
                            */
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

        // Entrée
        System.out.println(ANSI_YELLOW + "Entrées:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-------------------" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "[1] Pan seared Salmon - Contains: Salmon, olive oil, butter, garlic, lemon, salt, pepper, fresh herbs. $34.13" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "[2] Truffle Carbonara - Contains: Spaghetti, eggs, pancetta, Parmesan cheese, black truffle oil, garlic, black pepper, butter. $35.33" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "[3] Pan seared Filet Mignon and Butter Poached Lobster - Contains: Filet mignon, lobster tail, butter, garlic, thyme, rosemary, olive oil, salt, pepper, lemon. $42.97" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "[4] Spicy Shrimp with rice - Contains: Shrimp, jasmine rice, garlic, chili, olive oil, soy sauce, lime, ginger, cilantro, salt, pepper. $30.42" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Select an entrée (1-4): " + ANSI_RESET);
        entrée = input.nextLine();
        String entréeChoice = entrée;
        /**
         * Switch statement to check which entrée the user will choose
         * @param entrée is the input that the user will choose
         */
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

        // Desserts
        System.out.println(ANSI_YELLOW + "Desserts:" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "-------------------" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "[1] Chocolate Lava Cake - Contains: Dark chocolate, butter, sugar, eggs, flour, vanilla extract, salt. $15.50" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "[2] Chocolate Soufflé - Contains: Dark chocolate, eggs, sugar, butter, flour, milk, vanilla extract, salt. $17.10" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "[3] Creme Brulee - Contains: Heavy cream, egg yolks, sugar, vanilla bean, salt. $12.75" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "[4] Ice Cream - Earl Grey, Peach Basil, Match Green Tea, Roasted Pistachio. $8.10" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Select a dessert (1-4): " + ANSI_RESET);
        desserts = input.nextLine(); 
        String dessertChoice = desserts;
        /**
         * Switch statement to check which dessert the user will choose
         * @param dessert is the input that the user will choose
         */
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
                    /**
                    * If statement to check which kind of dessert the user will choose
                    * @param dessertChoice is the input that the user will choose
                    */
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

        // Create an order
        Order order = new Order();

        // Add items to the order
        order.addItem(appetizerChoice);
        order.addItem(drinkChoice);
        order.addItem(entréeChoice);
        order.addItem(dessertChoice);

        // Update the total price in the order
        order.setTotalPrice(totalPrice);

        // Generate the ticket
        order.orderTicket();

        // Write the order to a file
        order.writeOrderToFile("order_ticket.txt");
        }
    }