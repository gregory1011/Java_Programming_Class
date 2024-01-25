package day26_static;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Defoult constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls (double b){
        System.out.println("Constructor with double argument");
    }
    public ConstructorCalls (String c){
        this(2.5);
       // this();
        System.out.println("Constructor with String argument");
    }



    public static void main(String[] args) {

       method1();

        System.out.println("------------------------");

        method2();
    }



    public static void method1 (){
        System.out.println("Method 1");
    }

    public static void method2 (){
        method1();
        System.out.println("Method 2");
    }



}
