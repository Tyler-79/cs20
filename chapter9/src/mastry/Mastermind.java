package mastry;

import java.util.Scanner;

public class Mastermind {
	
	public static void code(int amount, int color) {
		//add a lot of if statments
		
		/* //loop for making the code//
		  for (int j = 1; j <= amount; j++) {
			    int code = (int)(Math.random() * color + 1);
			    System.out.print(code);
			}*/
		  return;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of pegs to use (1-10): ");
		int amount = input.nextInt();
		System.out.println("Enter the number of colors to use (1-9): ");
		int color = input.nextInt();
		
		code(amount, color);
		

	}

}
