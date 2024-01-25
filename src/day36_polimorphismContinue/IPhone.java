package day36_polimorphismContinue;

import java.util.Arrays;
import java.util.Objects;

public class IPhone {
    private String brand, model, size, color;
    private double price;


    public IPhone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price <= 0 ){
            System.err.println("Invalid price: "+ price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String [] colors = {"Black", "White", "Silver", "Gold", "Pink", "Red", "Blue", "Gray"};
        if (Arrays.asList(colors).contains(color)){
            this.color = color;
        }else {
            System.err.println("Invalid color: "+ color + " color of the phone can be, "+Arrays.toString(colors) );
            System.exit(1);
        }
    }

    public  void call(long phoneNumber){
        System.out.println(getModel()+ " is calling "+ phoneNumber);
    }
    public void text (long phoneNUmber){
        System.out.println(getModel() + " is texting "+ phoneNUmber);
    }



    public String toString() {
        return getClass().getSimpleName() +"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {  // if the given object is IPhone
        if ( ! (obj instanceof IPhone) ) {
            System.err.println("Invalid object. Object must be IPhone!");
            System.exit(1);
        }

        if (  obj instanceof IPhone ){
            if ( model.equals (  ( (IPhone) obj).model)  ) { // if the model of the IPhone is equal with the given IPhone's model
                if (color.equals( ( (IPhone) obj).color) ) { //  if the color of the IPhone is equal with the given IPhone's color
                    return true;
                }
            }
        }
        return false;
    }








}
