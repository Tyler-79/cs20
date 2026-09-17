package mastry;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// Declaration
		int total;
		int quart;
		int dime;
		int nick;
		int pen;
				
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
				
		//Get the first Integer from the keyboard
		System.out.print("Enter the change in cents:  ");
		total = userinput.nextInt();
				
		//math portion
		quart = total / 25;
		dime = (total - (quart * 25)) / 10;
		nick = (total - ((quart * 25) + (dime * 10))) / 5;
		pen = (total - ((quart * 25) + (dime * 10) + (nick * 5))) / 1;
				
		//display the results
		System.out.println("The minimum number of coins is: ");
		System.out.println("Quarters: " + quart); 
		System.out.println("Dimes: " + dime);
		System.out.println("Nickels: " + nick);
		System.out.println("Pennies: " + pen);

	}

}
