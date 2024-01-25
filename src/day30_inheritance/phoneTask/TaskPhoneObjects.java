package day30_inheritance.phoneTask;

import com.sun.source.doctree.SummaryTree;

public class TaskPhoneObjects {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("IPhone 12", "MaxPro", "Gold", 1200);

        Samsung samsung = new Samsung("Galaxy S22", "Medium", "White", 1100);

        Nokia nokia = new Nokia("Brick", "Small", "Black", 400);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        System.out.println("----------------------------------");

        iphone.text(123456);
        samsung.text(12345678);
        nokia.text(342245);

        System.out.println("----------------------------------");

        iphone.faceTime(123456);
        samsung.freeze();
        nokia.selfDefence();

        System.out.println("----------------------------------");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("--------------------------------------------------");







    }


}
