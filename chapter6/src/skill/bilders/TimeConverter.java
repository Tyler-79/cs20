package skill.bilders;

import java.util.Scanner;

public class TimeConverter {
	
	public static void hourstominutes() {
		int hours, min;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of hours: ");
		hours = input.nextInt();
		input.close();
		
		min = hours * 60;
		System.out.println("The amount of minutes is " + min);
	}
	
	public static void daystohours() {
		int days, hours;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of days: ");
		days = input.nextInt();
		input.close();
		
		hours = days * 24;
		System.out.println("The amount of hours is " + hours);
	}
	
	public static void minutestohours() {
		int min, hours;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of minutes: ");
		min = input.nextInt();
		input.close();
		
		hours = min / 60;
		System.out.println("The amount of hours is " + hours);
	}
	
	public static void hourstodays() {
		int hours, days;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of hours: ");
		hours = input.nextInt();
		input.close();
		
		days = hours / 24;
		System.out.println("The amount of days is " + days);
	}

	public static void main(String[] args) {
		int choice;
		Scanner input = new Scanner(System.in);
		
		/* prompt user for type of conversion */
		System.out.println("1. hours to minutes.");
		System.out.println("2. days to hours.");
		System.out.println("3. minuts to hours.");
		System.out.println("4. hours to days.");
		System.out.println("Enter your choice: ");
		choice = input.nextInt();
		if (choice == 1) {
			hourstominutes();
		} else if (choice == 2) {
			daystohours();
		} else if (choice == 3) {
			minutestohours();
		} else {
			hourstodays();
		}
		input.close();

	}

}
