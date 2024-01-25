package day04_concatenation;

public class PrimitiveTypesCastings {
    public static void main(String[] args) {
        // ------- Implicit Castings ----- small prim types to larger prim type
        byte a = 15;
        short b = a;  // b value is now 15 is called implicit casting
        // or: short b =(short)a;
        System.out.println(b);
        // example
        int c = a;  // implicit castings
        long d = 3000L;  // L is to make sure compiler understands is long data type
        float f =d; // implicit casting

        // example explicit casting
        double g = 220.4;
        int h = (int) g;
        System.out.println(h);
        // example #2
        int p = 330;
        double k = p;
        System.out.println(k);

        // ------- Explicit Casting --------
        int x = 100;
        byte y =(byte) x;
        float z =20.8F; //  f is to make sure compiler understands data type Float
        short q = (short) z;  // z = 20.8
        System.out.println(q);   // q is integer #

        // example
        double n1 = 2.5;
        byte n2 = (byte) n1; // n1 = 2.5
        System.out.println(n2);  // byte has no decimals, so n2 = 2

        System.out.println("---------------");

        // example
        int num = 500;
        byte result = (byte) num;  //  explicit casting
        System.out.println(result);

        // example
        int r = 5000;
        short t = (short) r;
        System.out.println(t);

        // example explicit casting
        double m = 100;
        int w = (int) m;
        System.out.println(w);








    }
}
