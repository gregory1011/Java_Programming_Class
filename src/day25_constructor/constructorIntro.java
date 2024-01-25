package day25_constructor;

public class constructorIntro {

    public constructorIntro (){
        System.out.println("Object is created by using no argument constructor");

    }


    public constructorIntro (int a){
        System.out.println("Object is created by using int argument");
    }


    public static void m(){

    }


    public static void main(String[] args) {

        constructorIntro object1 = new constructorIntro(10);

        constructorIntro object2 = new constructorIntro();

        constructorIntro object3 = new constructorIntro(10);





    }
}
