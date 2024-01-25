package day36_polimorphismContinue;

import day26_static.Iphone;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;

public class PolimorphismPractice {
    public static void main(String[] args) {


        Phone phone = new IPhone("Iphone 12 Pro", "Large", "Black", 1100);
        System.out.println(phone);

        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Red", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Small", "Gold", 400),
                new IPhone("Iphone 7", "Small", "White", 500)
        };



        // 1. print the model, color and price of each phone object in the following format
        //    				model - color - price

        // model - color - price
        for (Phone eachPhone : phones) {
            System.out.println(eachPhone.getModel()+ " - "+ eachPhone.getColor() + " - "+eachPhone.getPrice());
        }
        System.out.println("--------------------------------------------------------------------------------------");

        // 2. How many Iphone's in the array of phones?

        int countIphone = 0;
        for (Phone eachIphone : phones) {
            if (eachIphone instanceof IPhone){
                countIphone++;
            }
        }
        System.out.println("countIphone = " + countIphone);

        System.out.println("--------------------------------------------------------------------------------------");

        // 3. How many Samsung's in the array of phones?
        int countSamsung = 0;
        for (Phone eachIphone : phones) {
            if (eachIphone instanceof Samsung){
                countSamsung++;
            }
        }
        System.out.println("countSamsung = " + countSamsung);

        System.out.println("--------------------------------------------------------------------------------------");


        //    4. Display the models of Iphone's and samsung that has the price of 700 or greater
        //       castings: converting one type to another

        for (Phone eachPhone : phones) {
            if (eachPhone instanceof IPhone || eachPhone instanceof Samsung){
                if ( eachPhone.getPrice() >= 700 ){
                    System.out.println(eachPhone.getModel());
                }
            }
        }








    }
}
