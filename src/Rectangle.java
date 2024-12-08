public class Rectangle extends Shape {
    private double length;
    private double width;

     Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;

    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);

    }
}
