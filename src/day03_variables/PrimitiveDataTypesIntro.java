package day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {
        // DataType variableName = Data;
        // byte a = "Java"; // byte ONLY accepts integer value (-128 ~ +127)
        // byte a = 20.5; // byte can not accept decimal numbers.
      // byte a = 2000; // out of Byte's range.
         byte a = 20;

         // price of the car $17500
        short p = 17500;
        System.out.println("p"); // don't use this method
        System.out.println(p); // use this method to determine variableData

        // salary $95000
        int s = 95000; // int is the preferred dataType
        System.out.println(s);

        // int n= 990770550022;
        long n = 99077550022l;

        //gpa = 3.5;
        double gpa=3.5; // preferred
        float gpa2=3.5f;


    }
}
