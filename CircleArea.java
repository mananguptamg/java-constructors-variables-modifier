import java.util.Scanner;

class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Default radius is 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is: " + circle.calculateArea());
        sc.close();
    }
}

////Sample Output
//Enter the radius of the circle:
//        2
//The area of the circle is: 12.566370614359172