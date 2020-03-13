import java.util.Scanner;

public class ex3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("A program to reverse the number.");
        System.out.print("Input 4 digits number: ");

        String input = s.nextLine();
        String reverse = "";
        for(int i = 3; i>=0; i--) {
            reverse += input.charAt(i);
        }

        System.out.println("After reversed " + Integer.parseInt(reverse));
    }
}
