package assignment;

public class Rectangle {

    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the 
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Method to display the details of the rectangle
    public void displayRectangleDetails() {
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Displaying the details of the rectangle
        rectangle.displayRectangleDetails();		
	}

}
