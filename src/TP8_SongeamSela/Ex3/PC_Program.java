package TP8_SongeamSela.Ex3;

import java.util.Scanner;

public class PC_Program {
    public static void main(String[] args) {
        PC_DICE[] Room_306f = new PC_DICE[10];
        Room_306f[0] = new PC_DICE("PC0001","good");
        Room_306f[1] = new PC_DICE("PC0002","good");
        Room_306f[2] = new PC_DICE("PC0003","damaged");
        Room_306f[3] = new PC_DICE("PC0004","damaged");
        Room_306f[4] = new PC_DICE("PC0005","good");
        Room_306f[5] = new PC_DICE("PC0006","damaged");
        Room_306f[6] = new PC_DICE("PC0007","good");
        Room_306f[7] = new PC_DICE("PC0008","damaged");
        Room_306f[8] = new PC_DICE("PC0009","good");
        Room_306f[9] = new PC_DICE("PC0010","good");

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nPC Management Menu\n" +
                    "1. List all PCs\n" +
                    "2. List all damaged PCs\n" +
                    "3. List all good PCs\n" +
                    "4. Mark a PC as damaged\n" +
                    "5. Mark a PC as damaged\n" +
                    "6. Quit");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:{
                    System.out.println("\n PC_ID \t Status");
                    for (PC_DICE pc_dice : Room_306f) {
                        System.out.println(pc_dice.getPC_id() + "\t " + pc_dice.getStatus());
                    }
                }break;
                case 2:{
                    System.out.println("\n PC_ID \t Status");
                    for (PC_DICE pc_dice : Room_306f) {
                        if (pc_dice.getStatus().equals("damaged")) {
                            System.out.println(pc_dice.getPC_id() + "\t " + pc_dice.getStatus());
                        }
                    }
                }break;
                case 3:{
                    System.out.println("\n PC_ID \t Status");
                    for (PC_DICE pc_dice : Room_306f) {
                        if (pc_dice.getStatus().equals("good")) {
                            System.out.println(pc_dice.getPC_id() + "\t " + pc_dice.getStatus());
                        }
                    }
                }break;
                case 4:{
                    String pcId;
                    System.out.print("Enter the ID of a PC for changing status to damaged : ");
                    pcId = sc.nextLine();
                    boolean found = false;
                    for (PC_DICE pc_dice : Room_306f){
                        if (pc_dice.getPC_id().equals(pcId)){
                            pc_dice.setStatus("damaged");
                            found = true;
                            System.out.println("Successfully changed status");
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("PC not found!!!");
                    }
                }break;
                case 5:{
                    String pcId;
                    System.out.println("Enter the ID of a PC for changing status to good ");
                    pcId = sc.nextLine();
                    boolean found = false;
                    for (PC_DICE pc_dice : Room_306f){
                        if (pc_dice.getPC_id().equals(pcId)){
                            pc_dice.setStatus("good");
                            found = true;
                            System.out.println("Successfully changed status");
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("PC not found!!!");
                    }
                }
                default:
                    System.out.println("Please Enter valid number in the Menu ");
            }

        }while (choice !=6 );

    }
}
