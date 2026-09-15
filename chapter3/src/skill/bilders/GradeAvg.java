package skill.bilders;

import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
		//Declaration
		int G1;
		int G2;
		int G3;
		int G4;
		int G5;
		int Avg;
		
		
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Get the 5 grades
		System.out.print("Enter the first grade: ");
		G1 = userinput.nextInt();
		
		System.out.print("Enter the second grade: ");
		G2 = userinput.nextInt();
		
		System.out.print("Enter the third grade: ");
		G3 = userinput.nextInt();
		
		System.out.print("Enter the forth grade: ");
		G4 = userinput.nextInt();
		
		System.out.print("Enter the last grade: ");
		G5 = userinput.nextInt();
		
		//calculate grade average
		
		
		//Display the grade average
		System.out.println("your grade average is:  " + Avg);

	}

}
