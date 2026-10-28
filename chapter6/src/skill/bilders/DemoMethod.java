package skill.bilders;

public class DemoMethod {

	public static void main(String[] args) 
	{	
		//Call method 1
		displayMessage();
		
		//Call method 2
		greetStudent("steve");
		
		//Call method 3
		int total = addNumbers(6, 9);
		System.out.println("Total: " + total);
		
		//Call method 4
		double area = calculateArea(6.9);
		System.out.println("Area: " + area);
		
		//Call method 5
		boolean result = isPassing(95);
		System.out.println("Passing: " + result);
	}
	//Method 1: No Parameters, No Return Value
	public static void displayMessage()
	{
		System.out.println("Welcome to math class");
	}
	//Method 2: 1 Parameters, No Return Value
	public static void greetStudent(String name)
	{
		System.out.println("Hello, " + name);
	}
	//Method 3: 2 Parameters, Returns an integer
	public static int addNumbers(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
	//Method 4: 1 Parameters, Returns an decimal
	public static double calculateArea(double radius)
	{
		double area = 3.14 * radius * radius;
		return area;
	}
	//Method 5: 1 Parameters, Returns an boolean
	public static boolean isPassing(int mark)
	{
		return mark >= 50;
	}
}
