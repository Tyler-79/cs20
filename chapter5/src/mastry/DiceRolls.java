package mastry;

public class DiceRolls {
	
		  public static void main(String[] args) {
		  System.out.println("Dice 1:	Dice 2:  Total:");
		 
		  for (int j = 1; j <= 5; j++) {
			    int roll1 = (int)(Math.random() * 6 + 1);
			    int roll2 = (int)(Math.random() * 6 + 1);

			    System.out.println("      " + roll1 + "       " + roll2 + "       " + (roll1 + roll2));
			}

		  }
		}