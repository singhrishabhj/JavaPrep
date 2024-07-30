import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// THis class is representing a Shape
abstract class Shape implements ShapeI {
// Method to get the number of corners
    public abstract int getNumberOfCorners();

// Method to calculate the area
    public abstract double getArea();

    public String getPrettyName() {
	// class Circle shape with total area 3.141593
	return String.format("%s with total area %f", this.getClass().getName(), this.getArea());
    }
}

interface ShapeI {
    int getNumberOfCorners();
    double getArea();
    String getPrettyName();
}

// THis class is for a Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public int getNumberOfCorners() {
        return 4; // A rectangle has 4 corners
    }

    public double getArea() {
        return width * height;
    }
}

// Class for a Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public int getNumberOfCorners() {
        return 0; // As circle has no corners
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Class for a Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base; 
        this.height = height;
    }

    public int getNumberOfCorners() {
        return 3; // A triangle has 3 corners
    }

    public double getArea() {
        return 0.5 * base * height; //using 1/2*b*h
    }
}

// Main class to demonstrate the functionality 
public class ShapeLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ShapeI> shapes = new ArrayList<>();

        // Input and shapes
        System.out.println("Enter the number of shapes:");
        int numShapes = scanner.nextInt();
        for (int i = 0; i < numShapes; i++) {
            System.out.println("Enter the type of shape (rectangle/circle/triangle):");
            String type = scanner.next().toLowerCase();

            switch (type) {
                // if input is rectangle 
                case "rectangle":
                    System.out.println("Enter width :");
                    double width = scanner.nextDouble();
                    System.out.println("Enter height :");
                    double height = scanner.nextDouble();
                    shapes.add(new Rectangle(width, height));
                    break;

                    // if input is circle
                case "circle":
                    System.out.println("Enter radius:");
                    double radius = scanner.nextDouble();
                    shapes.add(new Circle(radius));
                    break;

                    //if input is triangle
                case "triangle":
                    System.out.println("Enter triangle base :");
                    double base = scanner.nextDouble();
                    System.out.println("Enter triangle height :");
                    double triHeight = scanner.nextDouble();
                    shapes.add(new Triangle(base, triHeight));
                    break;

                default:
                    System.out.println("Unknown shape type.");
                    break;
            }
        }

        scanner.close();
        // Calculate total number of corners and total area
        int totalCorners = 0;
        double totalArea = 0.0;
        for (ShapeI shape : shapes) {
	    System.out.println("Processing shape : " + shape.getPrettyName());
            totalCorners += shape.getNumberOfCorners();
            totalArea += shape.getArea();
        }

        // Output results
        System.out.println("Total number of corners: " + totalCorners);
        System.out.println("Total area: " + totalArea);
    }
}
