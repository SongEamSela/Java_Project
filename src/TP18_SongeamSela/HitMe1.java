package TP18_SongeamSela;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class HitMe1 implements Runnable ,NativeKeyListener{
    public static String text = "Hit Me !\n";
    public static boolean isstop = false;
    @Override
    public void run() {
        System.out.print("Start Running Program !\n");

        while (!isstop){
            System.out.print(text);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        System.out.print("\n Thank You !\n");
        System.exit(0);

    }

    public static void main(String[] args) {
        HitMe1 hitMe1 = new HitMe1();
        Thread thread = new Thread(hitMe1);
        thread.start();

        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(hitMe1);
   }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {
        System.out.println("Key Typed: " + NativeKeyEvent.getKeyText(nativeKeyEvent.getKeyCode()));
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(nativeKeyEvent.getKeyCode()));

        if (NativeKeyEvent.getKeyText(nativeKeyEvent.getKeyCode()).equals("Enter")){
            isstop = true;
        }

    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {
        System.out.println("Key Released: " + NativeKeyEvent.getKeyText(nativeKeyEvent.getKeyCode()));
    }
}

