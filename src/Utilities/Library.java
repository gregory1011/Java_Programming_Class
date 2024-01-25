package Utilities;

public class Library {

    public static void sleep(double seconds) throws InterruptedException{

        Thread.sleep((long)(seconds * 1000) );

    }
}
