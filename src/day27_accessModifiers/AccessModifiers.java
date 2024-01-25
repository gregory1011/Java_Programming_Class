package day27_accessModifiers;

public class AccessModifiers {

    public static  int publicData = 200;

    protected static int protectedData = 300;

   static int defaultData = 400;  // default modifier

    private static int privateData = 500;



    public static void main(String[] args) {


        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);

        new AccessModifiers();

    }


}
