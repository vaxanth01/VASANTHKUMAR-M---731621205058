package assignment;

public class Circle {
	
	    // Attribute
	    double radius;

	    // Constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Getter for radius
	    public double getRadius() {
	        return radius;
	    }

	    // Setter for radius
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate the area of the circle
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    // Method to calculate the circumference of the circle
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    // Method to display the details of the circle
	    public void displayCircleDetails() {
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + calculateArea());
	        System.out.println("Circumference: " + calculateCircumference());
	    }
	

	public static void main(String[] args) {
	      Circle circle = new Circle(5.0);

	        // Displaying the initial details of the circle
	        circle.displayCircleDetails();

	        // Modifying the radius
	        circle.setRadius(7.5);

	        // Displaying the updated details of the circle
	        circle.displayCircleDetails();

	}
	}

