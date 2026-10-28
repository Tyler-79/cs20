package mastry;

import java.util.Scanner;

public class DiceRollGame {
	
	public static void theRules()
	{
		//the rules of the game get shown to the player
		System.out.println("Dice Roll Game");
		System.out.println("Numbers 2 through 6 are low.");
		System.out.println("The number 7 is neither high nor low.");
		System.out.println("Numbers 8 through 12 are high.");
		System.out.println(" ");
	}
	
	public static int diceRoll()
	{	//This will make the number for the two dice
		int roll1 = (int)(Math.random() * 6 + 1);
	    int roll2 = (int)(Math.random() * 6 + 1);
	    return roll1 + roll2;
	}
	
	public static int Predition() {
		//This will be so the player can make a prediction
		Scanner input = new Scanner(System.in);
	    
		System.out.println("Make a call (1 for High, 0 for Low, or 7 for Seven) : ");
		return input.nextInt();
	}
	
	public static int points(int points) {
	    Scanner input = new Scanner(System.in);

	    while (true) {
	        System.out.println("Enter points to risk (or -1 to quit): ");
	        int risk = input.nextInt();

	        if (risk == -1) {
	            return -1;
	        }

	        if (risk <= 0 || risk > points) {
	            System.out.println("Invalid amount. Try again.");
	        } else {
	            return risk;
	        }
	    }
	}
	

public static void main(String[] args) {
    theRules();

    int totalPoints = 1000;

    while (totalPoints > 0) {
        System.out.println("You have " + totalPoints + " points.");

        int risk = points(totalPoints);

        // Quit if the player enters -1
        if (risk == -1) {
            break;
        }

        int guess = Predition();
        int dice = diceRoll();

        System.out.println("The number is " + dice);
        //find out if the player wins or lose and how much points they will have
        if (dice <= 6 && guess == 0) {
            System.out.println("You win!");
            totalPoints += risk;
        } else if (dice >= 8 && guess == 1) {
            System.out.println("You win!");
            totalPoints += risk;
        } else if (dice == 7 && guess == 7) {
            System.out.println("You win! Lucky number 7!");
            totalPoints += risk * 3;
        } else {
            System.out.println("You lose.");
            totalPoints -= risk;
        }

        System.out.println("You now have: " + totalPoints + " points");
        System.out.println();
    }

    System.out.println("Game over!");
}
}
