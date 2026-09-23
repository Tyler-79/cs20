package mastry;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		//declare the test percentage
		int grade;
		
		//scanner class for user
		Scanner input = new Scanner(System.in);
				
		//prompt the user for a percentage
		System.out.println("Enter the test percentage: ");
				
		//store the percentage given
		grade = input.nextInt();
		
		//find what grade the user got on the test and show the user
		if (grade >= 90 && grade <= 100) {System.out.println("The corresponding letter grade is: A");}
		else if (grade >= 80 && grade <= 89) {System.out.println("The corresponding letter grade is: B");}
		else if (grade >= 70 && grade <= 79) {System.out.println("The corresponding letter grade is: C");}
		else if (grade >= 60 && grade <= 69) {System.out.println("The corresponding letter grade is: D");}
		else {System.out.println("The corresponding letter grade is: F");}

	}

}
