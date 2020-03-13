package TP10_SongeamSela;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st Float number: ");
        float f1 = Float.parseFloat(sc.nextLine());
        System.out.print("Input 2nd Float number: ");
        float f2 = Float.parseFloat(sc.nextLine());
        System.out.print("Input 3rd Float number: ");
        float f3 = Float.parseFloat(sc.nextLine());

        System.out.println("The production of this 3 number is : "+ (f1*f2*f3));
    }
}
