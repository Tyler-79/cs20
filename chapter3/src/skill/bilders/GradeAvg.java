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
		int g1t;
		int g2t;
		int g3t;
		int g4t;
		
		
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Get the 5 grades and after the grade is put in a average is shown
		System.out.print("Enter the first grade: ");
		G1 = userinput.nextInt();
		
		g1t = G1 / 1;
		
		System.out.println("   your grade average is:  " + g1t);
		
		///                                                     \\\
		
		System.out.print("Enter the second grade: ");
		G2 = userinput.nextInt();
		
		g2t = (G1 + G2) / 2 ;
		
		System.out.println("   your grade average is:  " + g2t);
		
		///                                                     \\\
		
		System.out.print("Enter the third grade: ");
		G3 = userinput.nextInt();
		
		g3t = (G1 + G2 + G3) / 3 ;
		
		System.out.println("   your grade average is:  " + g3t);
		
		///                                                   \\\
		
		System.out.print("Enter the forth grade: ");
		G4 = userinput.nextInt();
		
		g4t = (G1 + G2 + G3 + G4) / 4 ;
		
		System.out.println("   your grade average is:  " + g4t);
		
		///                                                    \\\
				
		System.out.print("Enter the last grade: ");
		G5 = userinput.nextInt();
		
		//calculate grade average
		Avg = (G1 + G2 + G3 + G4 + G5) / 5;
		
		//Display the grade average
		System.out.println("  your grade average is:  " + Avg);

	}

}
