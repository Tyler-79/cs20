package mastry;

import java.util.Random;

public class RandomStats {
	
	public static void main(String[] args) {
		Random random = new Random();
        int[] groups = new int[10]; // Array to hold counts for groups 0 through 9
        int totalNumbers = 500;

        // 1. Generate 500 random numbers between 0 and 9
        for (int i = 0; i < totalNumbers; i++) {
            int randomNumber = random.nextInt(10); // Generates 0, 1, 2, ..., 9
            groups[randomNumber]++; // Increment the count for that specific group
        }

        // 2. Print the final stats
        System.out.println("Number	 Occurrences");
        for (int i = 0; i < groups.length; i++) {
            System.out.println(i + " 	 " + groups[i]);
        }
    }
}
