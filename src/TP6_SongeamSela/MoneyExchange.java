package TP6_SongeamSela;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        System.out.println("Wellcome to program Money Exchange!");
        System.out.println("1. Riels to Dollar ");
        System.out.println("2. Riels to Thai Baht ");
        System.out.println("3. Dollar to Riels ");
        System.out.println("4. Dollar to Thai Baht ");
        System.out.println("5. Thai Baht to Riels ");
        System.out.println("6. Exit ");
        Scanner sc = new Scanner(System.in);
        double money;
        double exchange;
        System.out.printf("Choose an option: ");
        int ch= Integer.parseInt(sc.nextLine());

        switch (ch){
            case 1:{
                System.out.printf("Input money in RIELS: ");
                money=Integer.parseInt(sc.nextLine());
                exchange=money/4091;
                System.out.println(money+" RIELS = " + exchange+ " USD");
            }break;
            case 2:{
                System.out.printf("Input money in RIELS: ");
                money=Integer.parseInt(sc.nextLine());
                exchange=money/136;
                System.out.println(money+" RIELS = " + exchange+ " Baht");
            }break;
            case 3:{
                System.out.printf("Input money in Dollar: ");
                money=Integer.parseInt(sc.nextLine());
                exchange=money*4077;
                System.out.println(money+" USD = " + exchange+ " RIELS");
            }break;
            case 4:{
                System.out.printf("Input money in Dollar: ");
                money=Integer.parseInt(sc.nextLine());
                exchange=money*30;
                System.out.println(money+" USD = " + exchange+ " Baht");
            }break;
            case 5:{
                System.out.printf("Input money in Baht: ");
                money=Integer.parseInt(sc.nextLine());
                exchange=money*135;
                System.out.println(money+" Baht = " + exchange+ " RIELS");
            }break;
        }

    }
}
