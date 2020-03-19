package TP15_SongeamSela;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] WdaysKH = { "ចន្ទ" , "អង្គារ" , "ពុធ" ,"​ព្រហស្បតិ៍ ","សុក្រ ","សៅរ៍"," អាទិត្យ" };
        String[] WdaysEN = {"Monday", "Tuesday", "Wednesday", "Thursday", "Saturday","Friday", "Sunday"};

        Scanner sc = new Scanner(System.in);
        String day;
        boolean stateError = false;

        do {
            System.out.print("Input day : ");
            day = sc.nextLine();

            if (day.equalsIgnoreCase("monday")){
                System.out.print(WdaysEN[0] +" = "+ WdaysKH[0]);
                stateError = false;
            }
            else if (day.equalsIgnoreCase("tuesday")) {
                System.out.print(WdaysEN[1] + " = " + WdaysKH[1]);
                stateError = false;
            }
            else if (day.equalsIgnoreCase("wednesday")) {
                System.out.print(WdaysEN[2] + " = " + WdaysKH[2]);
                stateError = false;
            }
            else if (day.equalsIgnoreCase("thursday")) {
                System.out.print(WdaysEN[3] + " = " + WdaysKH[3]);
                stateError = false;
            }
            else if (day.equalsIgnoreCase("saturday")) {
                System.out.print(WdaysEN[4] + " = " + WdaysKH[4]);
                stateError = false;
            }
            else if (day.equalsIgnoreCase("friday")) {
                System.out.print(WdaysEN[5] + " = " + WdaysKH[5]);
                stateError = false;
            }
            else if (day.equalsIgnoreCase("sunday")) {
                System.out.print(WdaysEN[6] + " = " + WdaysKH[6]);
                stateError = false;
            }
            else if (day.equals("ចន្ទ")) {
                System.out.print(WdaysKH[0] + " = " + WdaysEN[0]);
                stateError = false;
            }
            else if (day.equals("អង្គារ")) {
                System.out.print(WdaysKH[0] + " = " + WdaysEN[0]);
                stateError = false;
            }
            else if (day.equals("ពុធ")) {
                System.out.print(WdaysKH[0] + " = " + WdaysEN[0]);
                stateError = false;
            }
            else if (day.equals("ព្រហស្បតិ៍ ")) {
                System.out.print(WdaysKH[0] + " = " + WdaysEN[0]);
                stateError = false;
            }
            else if (day.equals("សុក្រ ")) {
                System.out.print(WdaysKH[0] + " = " + WdaysEN[0]);
                stateError = false;
            }
            else if (day.equals("សៅរ៍")) {
                System.out.print(WdaysKH[0] + " = " + WdaysEN[0]);
                stateError = false;
            }
            else if (day.equals(" អាទិត្យ")) {
                System.out.print(WdaysKH[0] + " = " + WdaysEN[0]);
                stateError = false;
            }
            else {
                stateError = true;
                System.out.print("Invalid Input please try again!!");
            }
        }while (stateError);


    }
}
