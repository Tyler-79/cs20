package skill.bilders;

public class Reverse {

	public static void main(String[] args) {
		final int num_elements = 10;
		
		int[] numbers = new int[num_elements];
		
		//store numbers
		for(int i = 0; i < num_elements; i++) {
			numbers[i] = i;
		}
		
		//display countdown
		System.out.println("countdown");
		
		for(int i = num_elements - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}

}
