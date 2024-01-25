package day27_accessModifiers;

public class InstanceBlock {

    {
        System.out.println("Print instance block");
    }

    public InstanceBlock( int a){
        System.out.println("Constructor");
    }


    public static void main(String[] args) {


      InstanceBlock object =  new InstanceBlock( 10);
        new InstanceBlock( 10);
        new InstanceBlock( 10);
        new InstanceBlock( 10);

    }
}
