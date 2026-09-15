package skill.bilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		//Declaration
				int ones;
				int tens;
				int num;
				int faketen;
				
				
				//Create Scanner object
				Scanner userinput = new Scanner(System.in);
				
				//Get the two-digit number from the keyboard
				System.out.print("Enter the number:  ");
				num = userinput.nextInt();
				
				//calculate the ones and tens
				tens = (num / 10) * 10;
				faketen = num / 10;
				ones = num - (faketen * 10);
				
				//Display the two-digit number in both the tens-place and the ones-place
				System.out.println("The ones-place of " + num + " is: " + ones);
				System.out.println("The tens-place of " + num + " is: " + faketen + " or " + tens);
				

	}

}
