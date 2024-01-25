package day27_accessModifiers;

public class instanceInitializationBlock {

    public String name;
    public int age;

    /*
    {
        name = "James";
        age = 20;
    }
     */

    public instanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

      /*
        instanceInitializationBlock obj1 = new instanceInitializationBlock();
        instanceInitializationBlock obj2 = new instanceInitializationBlock();

        System.out.println(obj1.name);
       */

        instanceInitializationBlock obj1 = new instanceInitializationBlock("James", 24);
        instanceInitializationBlock obj2 = new instanceInitializationBlock("Jora", 25);

        System.out.println(obj1.name);
        System.out.println(obj2.age);






    }



}
