package restaurant;

/*
 * author: Maria Alampay!
 * date: 10/01/2025
 * Restaurant class 
 */

 import java.util.Scanner;
import java.util.Random;

 public class Restaurant extends Menu { //since inheritance "is-a" relationship, does it make sense to use extend or should i be using composition instead
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to The Ivory Lounge, how many people are in your party?"); 
        
        String inp = input.nextLine();
        //gpty told me to change to .equals when I used to have ==
        if (inp.equals("exit")) {
            System.out.println("Goodbye!");
            return;
        }
        int num_of_people_in_party = Integer.parseInt(inp);
        Random random = new Random();
        //gpty helped me fix the random number generator
        int tableNumber = random.nextInt(20) + 1;
        System.out.println("Great! Please be seated at Table " + tableNumber + ", I'll bring out the menu.");
        System.out.println("Say 'ready' when you are ready to order!");

        inp = input.nextLine();
        while(!inp.equals("ready")){
            System.out.println("Let me know when you are ready to order.");
            inp = input.nextLine();
        }
        Menu.showMenu(); //show each cat instead

    }
}