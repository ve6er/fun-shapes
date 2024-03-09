import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Sphere");
        System.out.println("5. Cylinder");
        System.out.println("6. Pyramid");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Shape shape;
        String shapeName;

        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                shapeName = "Circle";
                break;
            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                shapeName = "Rectangle";
                break;
            case 3:
                System.out.print("Enter side length of square: ");
                double side = scanner.nextDouble();
                shape = new Square(side);
                shapeName = "Square";
                break;
            case 4:
                System.out.print("Enter radius of sphere: ");
                double sphereRadius = scanner.nextDouble();
                shape = new Sphere(sphereRadius);
                shapeName = "Sphere";
                break;
            case 5:
                System.out.print("Enter radius of cylinder: ");
                double cylinderRadius = scanner.nextDouble();
                System.out.print("Enter height of cylinder: ");
                double cylinderHeight = scanner.nextDouble();
                shape = new Cylinder(cylinderRadius, cylinderHeight);
                shapeName = "Cylinder";
                break;
            case 6:
                System.out.print("Enter length of pyramid base: ");
                double pyramidLength = scanner.nextDouble();
                System.out.print("Enter width of pyramid base: ");
                double pyramidWidth = scanner.nextDouble();
                System.out.print("Enter height of pyramid: ");
                double pyramidHeight = scanner.nextDouble();
                shape = new Pyramid(pyramidLength, pyramidWidth, pyramidHeight);
                shapeName = "Pyramid";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        shape.showShape(shapeName);
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());

        if (shape instanceof Volume) {
            Volume volumeShape = (Volume) shape;
            System.out.println("Volume: " + volumeShape.calculateVolume());
        }

        scanner.close();
    }
}