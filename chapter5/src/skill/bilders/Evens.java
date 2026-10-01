package skill.bilders;

public class Evens {

	public static void main(String[] args) {
		//declare the base integer and the final integer
		final int maxValue = 20;
		int newValue = 0;
		
		//show the user the numbers between 1 and 20
		System.out.println("Even numbers between 1-20");
		
		while( newValue < maxValue)
		{
			newValue += 2;
			
			System.out.println(newValue);
		}
	}

}
