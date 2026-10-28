package skill.bilders;

public class Circle {
	private static final double PI = 3.14;
	private double radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double area() {
		double circleArea;
		
		circleArea = PI * radius * radius;
		return(circleArea);
	}
	
	public double circumference() {
		double circle;
		
		circle = 2 * PI * radius;
		
		return circle;
	}
	
	public boolean equals(Object c) {
		Circle testObj = (Circle)c;
		
		if (testObj.getRadius() == radius) {
			return(true);
		} else {
			return(false);
		}
	}
	
	public String toString() {
		String circleString;
		
		circleString = "Circle has radius " + radius;
		return(circleString);
	}
	
	public double getRadius() {
		return(radius);
	}
	
	public static void displayAreaFormula() {
		System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}
	
	public static void main(String[] args) 
	{
		Circle c = new Circle(3);
		Circle c2 = new Circle(4);
		
		c.setRadius(3);
		
		System.out.println("Circle radius: " + c.getRadius());
		System.out.println("Circle circumference: " + c.circumference());
		System.out.println("Circle area: " + c.area());
		Circle.displayAreaFormula();
		
		if (c.equals(c2)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}
		System.out.println(c);
		System.out.println(c2);
	}

}
