package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {
    // the difference between these methods are execution flow.


    public  StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");

        // constructor block can take arguments
    }

    {
        System.out.println("Instance block");
        // don't take any arguments
        // depends on object
    }

    static {
        System.out.println("Static block");
        // don't take any arguments
        // it can't get executed more than once
        // does not depend on object at all
    }



    public static void main(String[] args) {

        System.out.println("Main method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();
        new StaticBlock_vs_InstanceBlock_vs_Constructor();




    }
}
