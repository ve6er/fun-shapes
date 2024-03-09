class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
