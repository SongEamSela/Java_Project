package TP7_SeunSiuphing;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String string= sc.nextLine();

        string=string.replaceAll("\\\\n" , "(New_line)");
        string=string.replaceAll("\\\\t" , "(tab)");
        string=string.replaceAll("\\\\\\\\" , "(slash)");
        string=string.replaceAll("//" , "(comment_line)");
        string=string.replaceAll(":\\)" , "(smile)");

        System.out.println(string);
    }
}
