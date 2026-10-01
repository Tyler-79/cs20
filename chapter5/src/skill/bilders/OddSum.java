package skill.bilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		//declare the base integer and the final integer and the sum
		final int max;
		int newValue = 1;
		int sum = 0;
				
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
				
		//Get the number from the user
		System.out.print("Enter a number:  ");
		max = userinput.nextInt();
				
		//show the user all the odd numbers between 1 and the given number
		System.out.println("Odd numbers between 1-" + max);
						
		while( newValue < max)
		{ newValue += 2;
							
		System.out.println(newValue); }
		for (int i = 1; i <= max; i++) {
		      sum = sum + i;
		    }
		    System.out.println("Sum is " + sum);
	}

}
