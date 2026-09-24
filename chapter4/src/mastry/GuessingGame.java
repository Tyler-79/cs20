package mastry;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		//declare both numbers
		int player, secret;
		
		//scanner class for user
		Scanner input = new Scanner(System.in);
						
		//prompt the user for a percentage
		System.out.println("Enter a number between 1 and 20: ");
						
		//store the percentage given
		player = input.nextInt();
		
		//computers number
		secret = (int)(Math.random() * 21);  // 0 to 20 i think this should be the range
		
		//check is the players number is the same as the computers number and show both numbers
		System.out.println("Computer's Number: " + secret);
		System.out.println("Player's Number: " + player);
		if (player == secret) {System.out.println("You won!");}
		else {System.out.println("Better luck next time.");}

	}

}
