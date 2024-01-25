package day05_operators;

public class RelationalOperators_2_special {
    public static void main(String[] args) {
        // equal == operator
        // not equal != operator

        System.out.println(1000==2000); // false
        System.out.println("java " == "Java"); // false
        System.out.println("java "== "java");   // false
        System.out.println("java"=="java");   // true
        System.out.println("Oscar" == " Good gay");   // false
        System.out.println(true == false );    // false
        System.out.println("--------------------------------");
        // != not equal operator
        System.out.println(1000!=2000); // true
        System.out.println("java " != "Java"); // true
        System.out.println("java "!= "java");   // true
        System.out.println("java"!="java");   // false
        System.out.println("Oscar" != " Good gay");   // true
        System.out.println(true != false );    // true



        
    }
}
