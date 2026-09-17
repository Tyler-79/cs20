package mastry;

import java.util.Scanner;
public class DivAndMod {

	public static void main(String[] args) {
		// Declaration
		int first;
		int second;
		int firstmod;
		int firstdiv;
		int secondmod;
		int seconddiv;
		
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Get the first Integer from the keyboard
		System.out.print("Enter a integer:  ");
		first = userinput.nextInt();
		
		//Get the second Integer from the keyboard
		System.out.print("Enter a second integer:  ");
		second = userinput.nextInt();
		
		//math portion
		firstdiv = first / second;
		firstmod = first % second;
		seconddiv = second / first;
		secondmod = second % first;
		
		//display the results
		System.out.println("  ");
		System.out.println(first + " / " + second + " = " + firstdiv);
		System.out.println(first + " % " + second + " = " + firstmod);
		System.out.println("  ");
		System.out.println(second + " / " + first + " = " + seconddiv);
		System.out.println(second + " % " + first + " = " + secondmod);


	}

}
