package day39_collections.multiThread;

public class TestMultiThreads {

    public static void main(String[] args) {

        Thread thread1 = new ThreadHelloWorld(1);
        Thread thread2 = new ThreadHelloWorld(2);
        Thread thread3 = new ThreadHelloWorld(3);
        Thread thread4 = new ThreadHelloWorld(4);
        Thread thread5 = new ThreadHelloWorld(5);

// threads are executed at the same time / 5 threads are executed at same time
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();






    }
}
