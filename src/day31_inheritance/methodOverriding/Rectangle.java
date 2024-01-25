package day31_inheritance.methodOverriding;

public class Rectangle extends Shape {


    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return area() * 2;
    }

    @Override
    public void draw() {
        super.draw();
    }
}
