/*
 * author: Maria Alampay!
 * date: 10/09/2025
 * Restaurant class 
 */

 import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Restaurant, how many people are in your party?"); // will change the name later but for now it is 'Restaurant'
        int num_of_people_in_party = input.nextInt();
        System.out.println("Great! Please be seated at Table 4, I'll bring out the menu."); // can I generate random numbers for tables between 1-14??? (maybe)
        
        String Goodbye = input.nextLine();
        if(Goodbye == "exit"){
            System.out.println("Goodbye!");
        } //something is wrong here and I will fix this tommorow 
    }
}  