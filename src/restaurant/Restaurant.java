package restaurant;

/*
 * author: Maria Alampay!
 * date: 10/01/2025
 * Restaurant class 
 */

 import java.util.Scanner;

 public class Restaurant extends Menu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Restaurant, how many people are in your party?"); // will change the name later but for now it is 'Restaurant'
        
        String inp = input.nextLine();
        //gpty told me to change to .equals when I used to have ==
        if (inp.equals("exit")) {
            System.out.println("Goodbye!");
            return;
        }
        int num_of_people_in_party = Integer.parseInt(inp);
        System.out.println("Great! Please be seated at Table 4, I'll bring out the menu."); // can I generate random numbers for tables between 1-14??? (maybe)
        //+ (random.nextInt(14) + 1) + 
        // i tried adding code that would generate a random number for the table but it keeps coming up as an error, ill i fix it tommorow

        // fix the showMenu so that it actually appears
        inp = input.nextLine();
        if(inp.equals("ready")){
            Menu.showMenu(); //show each cat instead
            //System.out.print("Select an appetizer (1-4): ");
        }
    }
}