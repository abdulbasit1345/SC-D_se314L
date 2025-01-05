package Lab10.task2;

final class GeometricConstants {
    private final double PI = Math.PI;

    public double getPI() {
        return PI;
    }

    public double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public double calculateSphereVolume(double radius) {
        return (4.0/3.0) * PI * Math.pow(radius, 3);
    }

    public double calculateSphereSurfaceArea(double radius) {
        return 4 * PI * radius * radius;
    }
}


class Shape {
    private double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void displayMeasurements() {
        GeometricConstants gc = new GeometricConstants();

        System.out.printf("Calculations for radius = %.2f:%n", radius);
        System.out.printf("Circle Circumference: %.2f units%n",
                gc.calculateCircumference(radius));
        System.out.printf("Circle Area: %.2f square units%n",
                gc.calculateCircleArea(radius));
        System.out.printf("Sphere Volume: %.2f cubic units%n",
                gc.calculateSphereVolume(radius));
        System.out.printf("Sphere Surface Area: %.2f square units%n",
                gc.calculateSphereSurfaceArea(radius));
        System.out.println("------------------------");
    }
}

public class GeometricCalculator {
    public static void main(String[] args) {
        Shape shape = new Shape(5.0);

        shape.displayMeasurements();

        // Modify radius and display new calculations
        shape.setRadius(7.5);
        shape.displayMeasurements();

    }
}
