package mastry;

import java.util.Scanner;

public class GameOf21 {
	
	public static int house() {
		int card1 = (int)(Math.random() * 13 + 1);
		int card2 = (int)(Math.random() * 13 + 1);
		int house = card1 + card2;
		System.out.println("The house has a: " + card1 + " and a " + card2 + " total of " + house);
		return card1 + card2;
	}
	
	public static int card() {
		int card1 = (int)(Math.random() * 13 + 1);
		int card2 = (int)(Math.random() * 13 + 1);
		int max = card1 + card2;
		System.out.println("you have " + card1 + " and " + card2 + " total is: " + max);
		return card1 + card2;
	}
	
	public static int HitOrCall() {
		Scanner input = new Scanner(System.in);
		System.out.println("Hit or Call (1 for Hit, 0 for Call) : ");
		return input.nextInt();
	}

	public static void main(String[] args) {
		int extraCard = (int)(Math.random() * 13 + 1);
		int house = house();
		int max = card();
		int HitOrCall = HitOrCall();
		int total;
		 
		if (HitOrCall == 1) {
			total = max + extraCard;
			if (total > 21) {
				System.out.println("You got " + extraCard);
				System.out.println("you busted with " + total);
			} else { System.out.println("You got " + extraCard + " makeing your total: " + total); }
		} else { total = max; }
		
		if (house < total) {
			System.out.println("You win!");
		} else if (house > total) {
			System.out.println("You lose.");
		} else {
			System.out.println("Its a tie?");
		}
	}

}
