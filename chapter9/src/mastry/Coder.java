package mastry;

import java.util.Scanner;

public class Coder {
	
	public static String shiftedword(String word) {
		StringBuilder result = new StringBuilder();
		
		for (char c : word.toCharArray()) {
			if (Character.isLowerCase(c)) {
                // Shift lowercase letters and wrap around alphabet
                char shifted = (char) ('a' + (c - 'a' + 2) % 26);
                result.append(shifted);
            } else if (Character.isUpperCase(c)) {
                // Shift uppercase letters and wrap around
                char shifted = (char) ('A' + (c - 'A' + 2) % 26);
                result.append(shifted);
            } else {
                // Keep spaces, numbers, or symbols as they are
                result.append(c);
            }
        }

        return result.toString();
    }


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String code = input.nextLine();

		String word = code;
        StringBuilder shiftedWord = new StringBuilder();

        System.out.println("Encoded message: " + shiftedword(code));

	}

}
