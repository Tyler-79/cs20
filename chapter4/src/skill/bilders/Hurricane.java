package skill.bilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		//declare wind category
		int wind;
		
		//scanner class for user
		Scanner input = new Scanner(System.in);
				
		//prompt the user for category
		System.out.println("Enter the category of the hurricane: ");
				
		//store the wind speed
		wind = input.nextInt();
		
		//Calculate the category
		if (wind == 1) {
			System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr");
		} 
		else if (wind == 2) {
			System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr");
		} 
		else if (wind == 3) {
			System.out.println("Category 3: 111-130 mph or 96-113 ky or 178-209 km/hr");
		} 
		else if (wind == 4) {
			System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr");
		}
		else {
			System.out.println("Category 5: greater than 155 mph or 135 kt or 249 km/hr");
		}	
				

	}

}
