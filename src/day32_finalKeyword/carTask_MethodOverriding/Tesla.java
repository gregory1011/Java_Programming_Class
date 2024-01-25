package day32_finalKeyword.carTask_MethodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public final class Tesla extends Car{
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + getMake() +" "+ getModel());
    }

    public void autoPilot(){
        System.out.println(getMake()+" "+ getModel()+" is on self-driving mode");
    }

    @Override
    public void setModel(String model) {
        String[] models = {"Model S", "Model Y", "Model X", "Model 3" };

        if ( !Arrays.asList(models).contains(model)){
            System.err.println("Invalid Tesla Model: "+ model);
            System.exit(1);
        }
        super.setModel(model);  // this.model = model; is going to execute this code
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));
        if (!colors.contains(color)){
            System.err.println("Invalid Tesla color "+ color);
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if (year < 2008){
            System.err.println("Invalid year: "+ year);
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if (price < 50000) {
            System.err.println("Invalid price for Tesla car: "+price);
            System.exit(1);
        }

        super.setPrice(price);
    }
}
