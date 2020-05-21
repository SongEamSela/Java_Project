package TP18_SongeamSela;

import java.util.Scanner;

public class ThreadGenerator implements Runnable{

    public int threadnum;
    ThreadGenerator( int num){
        threadnum = num;
    }

    public void run()
    {
        try
        {
            System.out.println ("Thread " +
                    threadnum +
                    " is running");

        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of thread: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++)
        {
            Thread object = new Thread(new ThreadGenerator(i));
            object.start();

            object.join(); // add object.join() to scheduling the thread
        }
    }

}
