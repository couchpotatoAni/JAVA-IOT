class Shape {
    public double calculateArea(){
        return 0;
    }
}
class Circle extends Shape{
    public final double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape {

    // Declare private double variables width and height
    public double width;
    public double height;

    // Constructor for Rectangle class that takes width and height as parameters
    public Rectangle(double width, double height) {
        // Assign the parameter width to the instance variable width
        this.width = width;
        // Assign the parameter height to the instance variable height
        this.height = height;
    }

    // Override the calculateArea method from the Shape class
    @Override
    public double calculateArea() {
        // Calculate and return the area of the rectangle using the formula width * height
        return width * height;
    }
}
class Triangle extends Shape {

    // Declare private double variables base and height
    private final double base;
    private final double height;

    // Constructor for Triangle class that takes base and height as parameters
    public Triangle(double base, double height) {
        // Assign the parameter base to the instance variable base
        this.base = base;
        // Assign the parameter height to the instance variable height
        this.height = height;
    }

    // Override the calculateArea method from the Shape class
    @Override
    public double calculateArea() {
        // Calculate and return the area of the triangle using the formula 0.5 * base * height
        return 0.5 * base * height;
    }
}
public class Main {

    // Main method that serves as the entry point for the application
    public static void main(String[] args) {

        // Create a Circle object with radius 4
        Circle circle = new Circle(4);
        // Print the area of the Circle object
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Create a Rectangle object with width 12 and height 34
        Rectangle rectangle = new Rectangle(12, 34);
        // Print the area of the Rectangle object
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        // Create a Triangle object with base 5 and height 9
        Triangle triangle = new Triangle(5, 9);
        // Print the area of the Triangle object
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
    }
}