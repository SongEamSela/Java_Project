package TP10_SongeamSela;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of the week : ");
        int day = Integer.parseInt(sc.nextLine());

        switch (day){
            case 1:{
                System.out.println("1. Sunday for Red. Sunday refer to the sun, Sunlight bring bright and strong with seen as red.");
            }break;
            case 2:{
                System.out.println("2. Monday for Orange. It truly looks like a beautiful moon and bring a peaceful and victory.");
            }break;
            case 3:{
                System.out.println("3. Tuesday for Purple or Violet. In Khmer, Tuesday translate to Mars, which means hardness and nasty.");
            }break;
            case 4:{
                System.out.println("4. Wednesday for green of the plant (Blend of green and copper)");
            }break;
            case 5:{
                System.out.println("5. Thursday for green or yellowish green of the leaves of a banana palm.");
            }break;
            case 6:{
                System.out.println("6. Friday for Blue.");
            }break;
            case 7:{
                System.out.println("7. Saturday for ripe spine.");
            }break;
            default:
                System.out.println("Invalid number of the day.");
        }
    }
}
