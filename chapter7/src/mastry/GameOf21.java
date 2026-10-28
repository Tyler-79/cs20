package mastry;

import java.util.Scanner;

public class GameOf21 {
	
	public static int house() {
		//this is for the house to get cards
		int card1 = (int)(Math.random() * 13 + 1);
		int card2 = (int)(Math.random() * 13 + 1);
		int house = card1 + card2;
		System.out.println("The house has an: " + card1);
		// + " and a " + card2 + " total of " + house // this is here to test
		return card1 + card2;
	}
	
	public static int card() {
		//this is for the player to get their cards
		int card1 = (int)(Math.random() * 13 + 1);
		int card2 = (int)(Math.random() * 13 + 1);
		int max = card1 + card2;
		int Ace1, Ace2;
		System.out.println("you have " + card1 + " and " + card2 + " total is: " + max);
		//if they have an ace
		if (card1 == 1 || card1 == 11) {
			Scanner input = new Scanner(System.in);
			System.out.println("Your first card is an ace aka (" + card1 + ") do you want it to be 1 or 11: ");
			Ace1 = input.nextInt();
			return Ace1 + card2;
		} else if (card2 == 1 || card2 == 11) {
			Scanner input = new Scanner(System.in);
			System.out.println("Your second card is an ace (" + card2 + ") do you want it to be 1 or 11: ");
			Ace2 = input.nextInt();
			return Ace2 + card1;
		} else {
		return card1 + card2;
		}
	}
	
	public static int HitOrCall() {
		//this is so the player to hit or call
		Scanner input = new Scanner(System.in);
		System.out.println("Hit or Call (1 for Hit, 0 for Call) : ");
		return input.nextInt();
	}
	
	public static int PlayMore() {
		Scanner input = new Scanner(System.in);
		System.out.println("-1 to stop: ");
		int play = input.nextInt();
		while (play != -1) {
			//declare what's what
			int extraCard = (int)(Math.random() * 13 + 1);
			int house = house();
			int max = card();
			int total;
			 //if the player goes over 21
			if (max > 21) {
				System.out.println("you busted with " + max);
			}
			if (HitOrCall() == 1) {
				total = max + extraCard;
				if (total > 21) {
					System.out.println("You got " + extraCard);
					System.out.println("you busted with " + total);
				} else { System.out.println("You got " + extraCard + " making your total: " + total); }
			} else { total = max; }
			//Decide who wins or if its a tie
			if (house < total || house > 21) {
				System.out.println("You win!");
				System.out.println("you had " + total + " the house had " + house);
			} else if (house > total && house <= 21) {
				System.out.println("You lose.");
				System.out.println("you had " + total + " the house had " + house);
			} else {
				System.out.println("Its a tie?");
				System.out.println("you had " + total + " the house had " + house);
			}
		}
		return play;
	}

	public static void main(String[] args) {
		//declare what's what
		int extraCard = (int)(Math.random() * 13 + 1);
		int house = house();
		int max = card();
		int total;
		 //if the player goes over 21
		if (max > 21) {
			System.out.println("you busted with " + max);
		}
		if (HitOrCall() == 1) {
			total = max + extraCard;
			if (total > 21) {
				System.out.println("You got " + extraCard);
				System.out.println("you busted with " + total);
			} else { System.out.println("You got " + extraCard + " making your total: " + total); }
		} else { total = max; }
		//Decide who wins or if its a tie
		if (house < total || house > 21) {
			System.out.println("You win!");
			System.out.println("you had " + total + " the house had " + house);
		} else if (house > total && house <= 21) {
			System.out.println("You lose.");
			System.out.println("you had " + total + " the house had " + house);
		} else {
			System.out.println("Its a tie?");
			System.out.println("you had " + total + " the house had " + house);
		}
		PlayMore();
}
}
