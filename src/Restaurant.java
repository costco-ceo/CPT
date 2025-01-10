/*
 * author: Maria Alampay
 * date: 09/01/2025
 * Restaurant class 
 */

 import java.util.Scanner;
 import java.util.Random;

public class Restaurant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Restaurant, how many people are in your party?"); // will change the name later but for now it is 'Restaurant'
        
        String inp = input.nextLine();
        if (inp.equals("exit")) {
            System.out.println("Goodbye!");
            return;
        }
        int num_of_people_in_party = Integer.parseInt(inp);
        System.out.println("Great! Please be seated at Table 4, I'll bring out the menu."); // can I generate random numbers for tables between 1-14??? (maybe)
        
        inp = input.nextLine();
        if(inp.equals("ready")){
            System.out.println("What appetizer would you like to start with?");
        }
        String Goodbye = input.nextLine();
        if(Goodbye.equals("exit")){
            System.out.println("Goodbye!");
        }
        // this ^^^ still doesnt work but ill fix it later


        
    }
}  