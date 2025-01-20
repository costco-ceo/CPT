package restaurant;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/*
 * author: Maria Alampay
 * date: 13/01/2025
 * Order class 
 */

/**
 * The Order class is responsible for creating an order ticket for the customer.
 * The class contains methods to add items to the order, set the total price of the order, get the total price of the order, generate an order ticket, and write the order ticket to a file.
 */

public class Order {
    //instance variables
    private static final Random random = new Random(); //random number generator for order numbers (gpty helped with this line)
    private static int orderCounter = 0; //static counter to keep track of order numbers
    private final int orderNumber; //different order number for each order
    private Scanner input = new Scanner(System.in);
    private ArrayList<String> items; //list to store items ordered
    private final Stack<String> itemStack; //stack to temporarily store items
    private double totalPrice; //total price of the order
    private String item;

    //ANSI escape codes for colors (I found this all on google)
    //https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
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
     * Constructor to initialize an Order object.
     */
    public Order(){
        items = new ArrayList<>();
        itemStack = new Stack<>();
        totalPrice = 0.0;
        orderNumber = random.nextInt(100000); //increment the order counter and assign the order number
    }

    /**
     * Gets the order number.
     * 
     * @return The order number.
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Adds an item to the order. 
     * 
     * @param item The item to be added to the order.
     */
    public void addItem(String item){
        itemStack.push(item);
        items.add(itemStack.pop());
    }

    /**
     * Sets the total price of the order.
     * 
     * @param totalPrice The total price to be set.
     */
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }

    /**
     * Gets the total price of the order.
     * 
     * @return The total price of the order.
     */
    public double getTotalPrice(){
        return this.totalPrice;
    }

    /**
     * Gets the list of items in the order.
     * 
     * @return The list of items in the order.
     */
    public ArrayList<String> getItems(){
        return this.items;
    } 

    /**
     * Generates and prints the order ticket.
     */
    public void orderTicket() {
        System.out.println(ANSI_BLUE + "===== ORDER TICKET =====" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Order Number: " + orderNumber + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "------------------------" + ANSI_RESET);
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println(ANSI_YELLOW + "------------------------" + ANSI_RESET);
        System.out.printf(ANSI_RED + "Total Price: $%.2f%n", totalPrice);
        System.out.println(ANSI_YELLOW + "========================" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Order ticket generated." + ANSI_RESET);

    }
    
    /**
     * Writes the order ticket to a file.
     * 
     * @param filename The name of the file to write the order ticket to.
     */

    //gpt and google helped me with a lot of this method because I was having trouble writing to a file
    //https://www.digitalocean.com/community/tutorials/java-append-to-file
    public void writeOrderToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write("===== ORDER TICKET =====\n");
            writer.write("Order Number: " + orderNumber + "\n");
            writer.write("------------------------\n");
            for (String item : items) {
                writer.write(item + "\n");
            }
            writer.write("------------------------\n");
            writer.write(String.format("Total Price: $%.2f%n", totalPrice));
            writer.write("========================\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the order to the file.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the order ticket as a string.
     * 
     * @return The order ticket as a string.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== ORDER TICKET =====\n");
        sb.append("Order Number: ").append(orderNumber).append("\n");
        sb.append("------------------------\n");
        for (String item : items) {
            sb.append(item).append("\n");
        }
        sb.append("------------------------\n");
        //gpty helped me with the formatting of the total price so that it prints to 2 decimal places
        sb.append(String.format("Total Price: $%.2f%n", totalPrice));
        sb.append("========================");
        return sb.toString().trim();
        }

}
