package day36_polimorphismContinue;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area(){
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if ( ! (obj instanceof  Square) ){
            System.err.println("Invalid object , object must be square");
            System.exit(1);
        }

        if (side == ((Square) obj).side){
            return true;
        }
        return false;
    }
}
