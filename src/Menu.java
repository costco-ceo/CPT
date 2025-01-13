/*
 * author: Maria Alampay
 * date: 10/01/2025
 * Menu class 
 */

import java.util.Scanner;

public class Menu {
    public static void showMenu(){
        Scanner input = new Scanner(System.in);
        String sodaChoice = "Soda";
        String alcoholChoice = "Alcohol";

        //appetizers
        System.out.println("[1] Garden Salad - contains chicken, tomatoes, cucumbers, read onions");
        System.out.println("[2] Pan seared Scallops - pea purée");
        System.out.println("[3] Quail Eggs Benedict - contains");
        System.out.println("[4] Tuna Tartare");

        //drinks

        String appetizers = input.nextLine();
        String drinks = input.nextLine();
        String entrée = input.nextLine();
        String desserts = input.nextLine();
        
        //TODO: add price to the end of the cases

        switch (appetizers) {
            case "1": 
                //appetizers = 1; //change bc cant set appetizers as 1 
                break;
            case "2":
                
                break;
            case "3":
                break;
            case "4":
                break;
        }

        switch (drinks) {
            case "Water":
                break;
                //switch(sodaChoice){}
            case "Soda":
                break;
            case "Juice":
                break;
                //switch(alcoholChoice){}
            case "Alcohol":
                break;
        }
        
        switch (entrée) {
            case "Pan seared Salmon - contains ":
                break;
            case "Truffle Carbonara - contains ":
                break;
            case "Pan seared Filet Mignon with Butter Poached Lobster - contains ":
                break;
            case "Spicy Shrimp with rice - contains  ":
                break;
        }

        switch (desserts) {
            case "Chocolate Lava Cake - contains  ":
                break;
            case "Chocolate Soufflé - contains ":
                break;
            case "Creme Brulee - contains ":
                break;
            //switch(icecreameChoice)
            case "Ice Cream":
                break;
        }
        System.out.println("You are ordering: " + appetizers + drinks + entrée + desserts + ".");
    }
}
