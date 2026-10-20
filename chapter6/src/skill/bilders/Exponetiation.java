package skill.bilders;

import java.util.Scanner;

public class Exponetiation {
	
	public static void powerOf() {
		int num1, num2, power;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		input.close();
		
		power = (int) Math.pow(num1, num2);
		System.out.println(num1 + " to the power  " + num2 + " is: " + power);
	}

	public static void main(String[] args) {
		powerOf();
	}
}
