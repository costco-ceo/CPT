package restaurant;
import java.util.ArrayList;

/*
 * author: Maria Alampay
 * date: 13/01/2025
 * Order class 
 */

 //TODO: this claass is supposed to take the user's order and make like an order ticket in another file to keep track and also the prices
public class Order {
    private ArrayList<String> items; //list to store items ordered 
    private double totalPrice; //total price of the order
    

    //constructor
    public Order(){
        this.items = new ArrayList<String>();
        this.totalPrice = 0.0;
    }

    //method to generate the order ticket
    public void orderTicket(){
        System.out.println("===== ORDER TICKET =====");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    //another method 
    public ArrayList<String> getItems(){
        return this.items;
    }
        
        

}
