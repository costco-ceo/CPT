package restaurant;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * author: Maria Alampay
 * date: 13/01/2025
 * Order class 
 */

 //TODO: this claass is supposed to take the user's order and make like an order ticket in another file to keep track and also the prices
public class Order {
    private Scanner input = new Scanner(System.in);
    private ArrayList<String> items; //list to store items ordered 
    private double totalPrice; //total price of the order
    private String item;

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

    //constructor
    public Order(){
        items = new ArrayList<String>();
        totalPrice = 0.0;
    }

    public void addItem(String item){
        items.add(item);
    }

    //setter
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }

    // Method to generate the order ticket
    public void orderTicket() {
        System.out.println(ANSI_BLUE + "===== ORDER TICKET =====" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "------------------------" + ANSI_RESET);
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println(ANSI_YELLOW + "------------------------" + ANSI_RESET);
        System.out.printf(ANSI_RED + "Total Price: $%.2f%n", totalPrice);
        System.out.println(ANSI_YELLOW + "========================" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Order ticket generated." + ANSI_RESET);

    }

    //getter
    public double getTotalPrice(){
        return this.totalPrice;
    }

    //another method 
    public ArrayList<String> getItems(){
        return this.items;
    }    

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== ORDER TICKET =====\n");
        sb.append("------------------------\n");
        for (String item : items) {
            sb.append(item).append("\n");
        }
        sb.append("------------------------\n");
        //gpty helped me with the formatting of the total price so that it prints to 2 decimal places
        sb.append(String.format("Total Price: $%.2f%n", totalPrice));
        sb.append("========================\n");
            return sb.toString();
        }

}
