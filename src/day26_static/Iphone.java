package day26_static;

public class Iphone {


    public static String brand = "Apple";
    public String model, color;
    public int price;
    public static String OS = "iOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScree = true;
    public static boolean isExpensiveToFix = true;

     /*
    public static void printPhoneInfo (){ // static only accepts static but, NOT instance variable
      //  System.out.println("Model: "+ model);
       // System.out.println("Color: "+ color);
    }
      */

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){
        System.out.println("Brand" + brand);
        System.out.println("Color: "+ color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }


    public static void printOperatingSystem(){
        System.out.println("Operating system: " + OS);
    }




}
