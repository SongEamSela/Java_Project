import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Calculate the minimum amount of fuels.");

        System.out.print("Input distance from A to B (km): ");
        int ab = s.nextInt();
        System.out.print("Input distance from B to C (km): ");
        int bc = s.nextInt();
        System.out.print("Input the weight of goods (kg): ");
        int w = s.nextInt();
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
            System.out.println("Can not reach point B, point A to B needs more than 300litres.");
        } else if (fuel_rate * bc > 300) {
            System.out.println("Can not reach point C, point B to C needs more than 300litres.");
        }else if ((ab + bc) * fuel_rate <= 300) {
            System.out.println("No need to refill at point B.");
        } else {
            System.out.println("At point B, need to refill " + ((ab+bc)*fuel_rate - 300) + "litres");
        }

    }
}
