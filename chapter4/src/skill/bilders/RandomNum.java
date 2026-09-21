package skill.bilders;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		//declare the minimum and maximum
		int min;
		int max;
		
		//scanner class for user
		Scanner input = new Scanner(System.in);
		
		//prompt the user for min number
		System.out.println("Enter a minimum number: ");
		
		//store the min number
		min = input.nextInt();
		
		//prompt the user for max number
		System.out.println("Enter a maximum number: ");
				
		//store the max number
		max = input.nextInt();
		
		//Generate the random numbers
		System.out.println("random number: "
		             + (int)((max - min + 1) * Math.random()
		             + min));
		
		
		
	}

}
