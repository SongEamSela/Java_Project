package TP18_SongeamSela;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class BrainTest implements Runnable{
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    public static int result = 0;
    public static String status = "";
    String input = "";
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            if (input.equals("")){
                System.exit(0);
            }
        }
    };

    @Override
    public void run() {
        int A = random.nextInt(10);
        int B = random.nextInt(10);

        if (result == 10 ){
            status = "Master brain";
        }else if(result <10 && result > 5 ){
            status = "Good brain";
        }else {
            status = "Baby brain";
        }

        try
        {
            Timer timer = new Timer();
            timer.schedule( task, 5*1000 );
            System.out.print(A +" + "+B+ " = ?\n");
            int sum = sc.nextInt();
            sc.nextLine();
            timer.cancel();

            if ( (A+B) == sum){
                result++;
            }
            else {
                System.out.print("Result: Correct = "+ result+"-> "+ status );
                System.exit(0);
            }

        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }

    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Thread thread = new Thread(new BrainTest());
            thread.start();
        }
    }
}
