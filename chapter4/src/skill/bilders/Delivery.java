package skill.bilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		//declare the box dimensions
		int length, width, height;
		
		//scanner class for user
		Scanner input = new Scanner(System.in);
				
		//prompt the user for length
		System.out.println("Enter the length: ");
				
		//store the length given
		length = input.nextInt();
		
		//prompt the user for width
		System.out.println("Enter the width: ");
						
		//store the width given
		width = input.nextInt();
		
		//prompt the user for height
		System.out.println("Enter the height: ");
						
		//store the height given
		height = input.nextInt();
		
		//Calculate if the box can be accepted or rejected
		if (length <= 10 && width <= 10 && height <= 10) {
			System.out.println("Accepted: box has dimensions less then or equal to 10");
		} else {
			System.out.println("Rejected: box has dimensions greater then 10");
		}



	}

}
