package day17_CustomClass;

public class Car {
    public String brand, model;
    public int year;
    public String size, fuel, drive;


    public void carSet(String brand, String model, int year, String size, String fuel, String drive){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.size = size;
        this.fuel = fuel;
        this.drive = drive;
    }

    public void testDrive(){
        System.out.println("I like to drive "+ brand+" "+model+" "+year );
    }

    public String toString() {
        return "CustomClassCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", size='" + size + '\'' +
                ", fuel='" + fuel + '\'' +
                ", drive='" + drive + '\'' +
                '}';
    }


}
