package TP9_SongeamSela.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class SMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SMS> list_sms= new ArrayList<>();

        SMSList List = new SMSList(list_sms);
        int choice;
        do {
            System.out.println("1. Send new SMS with Encrypted content using password method\n" +
                    "2. View SMS detail\n" +
                    "3. List SMSes\n" +
                    "4. Remove SMSes by index\n" +
                    "5. Quit\n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1: {
                        System.out.print("Create new SMS");
                        System.out.print("Enter sender phone number : ");

                        System.out.print("Enter receiver phone number : ");

                        System.out.print("Enter the subject : ");

                        System.out.print("Write your SMS here : ");




                }break;
                case 2: {

                }break;
                case 3: {

                }break;
                case 4: {

                }break;
            }


        }while (choice!=5);
    }
}
