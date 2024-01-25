package day39_collections.multiThread;

public class ThreadHelloWorld extends Thread{

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println( "Hello World "+i+" Thread " + threadNumber );
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }






}
