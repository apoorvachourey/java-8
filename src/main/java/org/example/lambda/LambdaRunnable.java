package org.example.lambda;

public class LambdaRunnable {
    public static void main(String[] args) {
        /*
    Before Java 8
     */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Old Runnable Example!!");
            }
        };

        new Thread(runnable).start();
    /*
    after Java 8
     */

        Runnable runnable1 = ()->{
            System.out.println("Lambda Runnable 1");
        };

        new Thread(runnable1).start();

        new Thread(()-> System.out.println("Lambda Runnable 2 ")).start();

    }

}
