package TP6_SongeamSela;
import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate the minimum amount of fuels needed to refuel at point B.");

        System.out.print("Input distance from A to B (km): ");
        int ab = sc.nextInt();
        System.out.print("Input distance from B to C (km): ");
        int bc = sc.nextInt();
        System.out.print("Input the weight of goods (kg): ");
        int w = sc.nextInt();
        float fuel_rate = 0;
        if(w > 30000) {
            System.out.println("Can not be loaded.");
            return;
        } else if (w > 20000) {
            fuel_rate = 2;
        } else if (w > 10000) {
            fuel_rate = 1;
        } else if (w > 5000) {
            fuel_rate = 0.4f;
        } else if (w > 0) {
            fuel_rate = 0.2f;
        }

        if(fuel_rate * ab > 300) {
            System.out.println("Can not reach point B");
        } else if (fuel_rate * bc > 300) {
            System.out.println("Can not reach point C");
        }else if ((ab + bc) * fuel_rate <= 300) {
            System.out.println("No need to refuel");
        } else {
            System.out.println("At point B, need to refuel " + ((ab+bc)*fuel_rate - 300) + "litres");
        }

    }
}
