package skill.bilders;

public class Rectangle {
	
	private double length, width;
	
	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public String toString() {
		String rectangleString;
		
		rectangleString = "Rectangle has length " + length + " and width " + width;
		return(rectangleString);
	}
	
	public double area() {
		double rectangleArea;
		
		rectangleArea = length * width;
		
		return rectangleArea;
	}
	
	public boolean equals(Object r) {
		Rectangle testObj = (Rectangle)r;
		
		if(testObj.getLength() == length && testObj.getWidth() == width) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Object r) {
		Rectangle testObj = (Rectangle)r;
		
		if(length < testObj.getLength() || width < testObj.getWidth()) {
			return(-1);
		} else if(length == testObj.getLength() || width == testObj.getWidth()) {
			return(0);
		} else {
			return(1);
		}
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 6);
		Rectangle r2 = new Rectangle(12, 17);
		
		System.out.println("Rectangle 1 has a length of " + r.getLength() + " and a width of " + r.getWidth());
		System.out.println("Rectangle 1 has a area of " + r.area());
		
		if (r.equals(r2)) {
			System.out.println("Rectangle are equal");
		} else {
			System.out.println("Rectangle are not equal");
		}
		System.out.println(r);
	}

}
