package day26_static;

public class TestIphoneObjects {

    public static void main(String[] args) {


        Iphone iphone = new Iphone("Iphone 12", "Black", 1200);

        System.out.println(iphone.color);
        System.out.println(iphone.price);
        System.out.println(iphone.model);

      //  iphone.printPhoneInfo();

      /*
        System.out.println(iphone.brand);
        System.out.println(iphone.OS);
        Iphone.printOperatingSystem();

       // System.out.println(Iphone.);

     */

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();




    }



}
