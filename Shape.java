abstract public class Shape {
    public void showShape(String shape){
        System.out.println("You have selected the shape "+shape);
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
