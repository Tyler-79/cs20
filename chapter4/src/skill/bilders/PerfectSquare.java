package skill.bilders;

import java.util.Scanner;

import java.lang.Math;

public class PerfectSquare {

	public static void main(String[] args) {
		//declare the integers
		double num, round, squrt, power;
		
		//scanner class for user
		Scanner input = new Scanner(System.in);
		
		//prompt the user for a integer
		System.out.println("Enter a integer: ");
		
		//store the integer given
		num = input.nextInt();
		
		////testing
		////System.out.println("the absolute of " + num + " is " + Math.abs(num));
		////System.out.println(num + " to the power of 2 is " + Math.pow(num, 2));
		////System.out.println("the square root of " + num + " is " + Math.sqrt(num));
		
		//math to find out if the given integer is a perfect square
		squrt = Math.sqrt(num);
		round = Math.round(squrt);
		power = Math.pow(round, 2);
		
		////System.out.println("square root of " + num + " is " + squrt + " then rounding " + round + " to the power of 2 is " + power);
		
		//show user if the given integer is a perfect square or not
		if (num != power) {System.out.println(num + " is not a perfect square root");}
		else { System.out.println(num + " is a perfect square root");}
				
						
				
	}



}
