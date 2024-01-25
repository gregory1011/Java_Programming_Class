package Utilities;

import day27_accessModifiers.AccessModifiers;

import static day27_accessModifiers.Data.d;
import static day27_accessModifiers.Data.e;
import static day27_accessModifiers.Data.f;

import static day27_accessModifiers.Data.*;

public class TestDataObjects_2 {
    public static void main(String[] args) {


        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        method3 ();
        method4();

        /*
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();

         */

        System.out.println("-------------------------------------------");

        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.protectedDate);
        // System.out.println(AccessModifiers.defaultDate);
      //   System.out.println(AccessModifiers.privateData);
        new AccessModifiers();



    }
}
