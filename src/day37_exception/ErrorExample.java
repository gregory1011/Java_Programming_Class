package day37_exception;

import java.util.ArrayList;

public class ErrorExample {
    public static void main(String[] args) {

        ArrayList<Pizza> pizza = new ArrayList<>();

        int i = 0;
        while (true){  // infinite loop
            System.out.println(++i);
            pizza.add((new Pizza('S', 2, 4)));
        }

        // accrue error of memory


    }
}
