package day17_CustomClass;

public class TestDogObjects {
    public static void main(String[] args) {


      Dog dog1 = new Dog();

      dog1.name = "Max";
      dog1.breed = "Husky";
      dog1.gender ='M';
      dog1.age = 4;
      dog1.size = "Large";
      dog1.color ="Black";


      Dog dog2 = new Dog();

      dog2.name ="Java";
      dog2.breed = "Golden Retriever";
      dog2.gender ='F';
      dog2.age =2;
      dog2.size = "Small";
      dog2.color = "Zebra";

      Dog dog3 = new Dog();
      dog3.setInfo("Sharik", "Chihuahua", 'M', 4, "Small", "Dark");

      Dog dog4 = new Dog();
      dog4.setInfo("Jessica", "chow chow", 'F', 3,"small", "red" );


      dog3.eat();
      dog2.drink();


      System.out.println(dog1);
      System.out.println(dog2);
      System.out.println(dog3);
      System.out.println(dog4);


    }

}
