package mastry;

import java.util.Scanner;

public class HiLo {
	
	public static int game(int points) {
	    int risk, predict, num;
	    Scanner input = new Scanner(System.in);

	    while (points > 0) {
	        System.out.println("You have " + points + " points.");
			System.out.println(" ");
	        System.out.println("Enter points to risk: ");
	        risk = input.nextInt();

	        // Check that the risk is valid
	        if (risk <= 0 || risk > points) {
	            System.out.println("Invalid amount. Try again.");
	            continue;
	        }

	        System.out.println("Predict (1=High, 0=Low): ");
	        predict = input.nextInt();

	        num = (int)(Math.random() * 13 + 1);
	        System.out.println("Number is " + num);

	        if (num <= 6 && predict == 0) {
	            System.out.println("You win!");
	            points += risk;
	        } else if (num >= 8 && predict == 1) {
	            System.out.println("You win!");
	            points += risk;
	        } else {
	            System.out.println("You lose.");
	            points -= risk;
	        }
			System.out.println(" ");
	        System.out.println("You now have: " + points + " points");
	    }

	    System.out.println("Game over! You ran out of points.");
	    return points;
	}

	public static void main(String[] args) {
		System.out.println("High Low Game");
		System.out.println(" ");
		System.out.println("Numbers 1 through 6 are low.");
		System.out.println("The number 7 is neither high nor low so you lose ether way.");
		System.out.println("Numbers 8 through 13 are high.");
		game(1000);
	}

}