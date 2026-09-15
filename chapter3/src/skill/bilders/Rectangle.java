package skill.bilders;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) 
	{
		//Declaration
		int length;
		int width;
		int area;
		int perimeter;
		
		
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Get the width from the keyboard
		System.out.print("Enter width:  ");
		width = userinput.nextInt();
		
		//Get the length from the keyboard
		System.out.print("Enter length:  ");
		length = userinput.nextInt();
		
		//Display the length and width
		System.out.println("The length is:  " + length);
		System.out.println("The width is:  " + width);
		
		//calculated area and perimeter of the rectangle
		area = length * width;
		perimeter = 2 * length + 2 * width;
		
		//Display the area and the perimeter
		System.out.println("The area of the rectangle is  " + area);
		System.out.println("Perimeter of the rectangle is:  " + perimeter);
		
	}
	
}
