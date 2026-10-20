package mastry;

public class House {

	public static void addRoof() {
		//it will add the roof
		System.out.println("   /\\   ");
		System.out.println("  /  \\  ");
		System.out.println(" /    \\ ");
		System.out.println("/______\\");
	}
	
	public static void addBase() {
		//it will add the base
		for (int j = 1; j <= 3; j++) {
		System.out.println("|      |");
		}
		System.out.println("|______|");
		
	}
	
	public static void addWalk() {
		//it will add the walkway
		System.out.println("   **   ");
		System.out.println("   ***********");
	}
	public static void main(String[] args) {
		//it will call all the other methods to build a house
		addRoof();
		addBase();
		addWalk();

	}


}
