class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double baseArea = baseLength * baseWidth;
        double sideArea = baseLength * Math.sqrt(Math.pow(baseWidth / 2, 2) + height * height) +
                baseWidth * Math.sqrt(Math.pow(baseLength / 2, 2) + height * height);
        return baseArea + sideArea;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3) * baseLength * baseWidth * height;
    }
}