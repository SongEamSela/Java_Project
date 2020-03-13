package TP10_SongeamSela;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rescue the Queen \n" +
                "To Rescue the Queen, You have to pass 3 test\n" +
                "Answer with only 'yes' & 'no' or it will be game over");
        System.out.print("1st question : You enter into the first room, here it is a lot of gold. Whether you will take it?\n" +
                "answer: ");
        boolean respond = sc.nextLine().equalsIgnoreCase("no");
        if (respond){
            System.out.println("Congratulation, you have passed the first test honor!");
            System.out.print("2nd question: You pass in a following room. It is full of diamonds, whether you will take diamonds?\n" +
                    "Answer: ");
            respond = sc.nextLine().equalsIgnoreCase("no");
            if (respond){
                System.out.println("Congratulation, you have passed the second test of honor!!!");
                System.out.print("3rd question: You enter into the third room. A person was attacking by a dragon! To move further, not paying to them of attention?\n" +
                        "Answer: ");
                respond = sc.nextLine().equalsIgnoreCase("no");
                if (respond){
                    System.out.println("Congratulation, you have pass all tests of honor. Princess gets to you!!!");
                }
                else System.out.println("You try to pass past, but a dragon notice your presence and transforms you into ashes. You are dead!!! GAME is over!!!");
            }
            else System.out.println("Diamonds remain to you, but you have ruined the second test");
        }
        else System.out.println("Gold remains to you, but you have ruined test. GAME is over!!!");




    }
}
