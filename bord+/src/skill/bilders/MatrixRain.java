package skill.bilders;

import java.util.Random;

public class MatrixRain {
		    public static void main(String[] args) throws InterruptedException {
		        Random rand = new Random();
		        int width = 80; // Width of the terminal screen

		        System.out.print("\033[H\033[2J"); // Clear console screen
		        
		        while (true) {
		            StringBuilder line = new StringBuilder();
		            for (int i = 0; i < width; i++) {
		                int choice = rand.nextInt(5);
		                if (choice == 0) {
		                    // Print a random visible green ASCII character
		                    char standardChar = (char) (rand.nextInt(93) + 33);
		                    line.append("\033[32m").append(standardChar).append(" ");
		                } else {
		                    // Print empty space
		                    line.append("  ");
		                }
		            }
		            System.out.println(line.toString());
		            Thread.sleep(50); // Control the speed of the waterfall effect
		        }
		    }
		


	}
