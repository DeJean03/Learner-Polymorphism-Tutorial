public class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
