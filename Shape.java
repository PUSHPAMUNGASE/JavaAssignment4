package assignment2oct;

public class Shape {


	    // Method to print area and perimeter of square
	    public void printArea(int side) {
	        int area = side * side;
	        System.out.println("Area of Square: " + area);
	    }

	    public void printPerimeter(int side) {
	        int perimeter = 4 * side;
	        System.out.println("Perimeter of Square: " + perimeter);
	    }

	    // Method to print area and perimeter of rectangle
	    public void printArea(int length, int breadth) {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    public void printPerimeter(int length, int breadth) {
	        int perimeter = 2 * (length + breadth);
	        System.out.println("Perimeter of Rectangle: " + perimeter);
	    }

	    public static void main(String[] args) {
	        Shape shape = new Shape();

	        // For Square
	        shape.printArea(5);         // Only one argument for square
	        shape.printPerimeter(5);    // Only one argument for square

	        // For Rectangle
	        shape.printArea(4, 6);      // Two arguments for rectangle
	        shape.printPerimeter(4, 6); // Two arguments for rectangle
	    }
	}


