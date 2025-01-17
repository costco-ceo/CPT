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
        System.out.println("===== ORDER TICKET =====");
        System.out.println("------------------------");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("------------------------");
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("========================");
        System.out.println("Order ticket generated.");

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
        sb.append("Total Price: $").append(totalPrice).append("\n");
        sb.append("========================\n");
            return sb.toString();
        }

}
