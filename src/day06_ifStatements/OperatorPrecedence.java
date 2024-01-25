package day06_ifStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println(5+2*3);  // 11
        System.out.println(7+3-2/2);  // 9
        System.out.println(-5+2);    //  -3
        System.out.println(10>9==8<7);     // false
              //         true == false ==> false
        System.out.println(10>9==8<7 && "java "== "python" || 'a'== 'A') ;   // false
        //              true == false && "java" == "python" || 'a' =='A'
        //                  false     &&       false        ||     false
        //                          false                   ||     false
        //                                                false


        System.out.println(100  >=  20   &&   40   *  2  >  60);   // true
                        // 100   >= 20   &&     80   >    60
                 //             true    &&        true
        //                            true


         int a = 20;
             a+=10 + 2* 3;
         // a +=10+6
        // a+= 16
        // a += 16
        // 10 + 16
        // a= 36;
        System.out.println(a);   // 36

    }
}
