package day36_polimorphismContinue;

public class Circle {

    private double radius;
    public final static double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius + PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {  // if the specified object os not circle, then we should not compare them
        if ( ! (obj instanceof Circle ) ){
            System.err.println("Invalid Object");
            System.exit(1);
        }
        if (this.radius == ( (Circle)obj ).radius){ // if the current circle radius is equal to given circle radius , then two are equal.
            return true;
        }
        return false;
    }


    //  ' == '  compare objects of 2 strings if they are same or not
    // .equals()







}
