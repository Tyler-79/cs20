package mastry;

public class DiceRolls {
	
		  public static void main(String[] args) {
			  ///int random = (int)(Math.random() * 6) + 1;
			  // Outer loop.
		    for (int i = 1; i <= 2; i++) {
		      System.out.println("Outer: " + i); // Executes 2 times
		      
		      // Inner loop
		      for (int j = 1; j <= 5;) {
		        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
		      }
		    } 
		  }
		}