package skill.bilders;

import java.util.Scanner;
import java.math.MathContext;

public class Distance {
	
	public static void main(String[] args)
	{
		//Declaration
				double first;
				double second;
				double third;
				double total;
				
				
				try (//Create Scanner object
				Scanner userinput = new Scanner(System.in)) {
					//Get the first segment from the user
					System.out.print("Enter the first segment:  ");
					first = userinput.nextDouble();
					
					//Get the second segment from the user
					System.out.print("Enter the second segment:  ");
					second = userinput.nextDouble();
					
					//Get the third segment from the user
					System.out.print("Enter the third segment:  ");
					third = userinput.nextDouble();
				}
				
				//calculated total length of the race
				total = first + second + third;
				System.out.println("The total distance of the race is:  " + total + "km" );
				
		
	}
}
