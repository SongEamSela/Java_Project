package TP19_SongeamSela;

import java.util.Random;
import java.util.Scanner;

public class BlackjackGame implements Runnable{
    Scanner sc = new Scanner(System.in);
    Thread thread;
    Random random = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.print("Welcome to Blackjack Game . \n");
            System.out.print("How many players ? : ");
            int player = sc.nextInt();
            sc.nextLine();


            System.out.print("Do you wish to continue to the game ? (yes/no) : ");
            String ans = sc.nextLine();
            sc.nextLine();
            if (ans.equalsIgnoreCase("no")) break;
        }
    }

    public void run(int numOfplayer){

        System.out.print("Player "+numOfplayer+" Enter your bet: ");




    }

    public void play(int player){

    }


    @Override
    public void run() {




    }

    public void Card_dealer(){
        int first_card,second_card;
        first_card = random.nextInt(13);
        second_card = random.nextInt(13);

        System.out.print("Card of dealer hand is : "+ showCard(first_card));


    }
    public void Card_player(){
        int first_card,second_card;

        System.out.print("Enter your bet: ");
        int bet = sc.nextInt();
        sc.nextLine();

        first_card = random.nextInt(13);
        second_card = random.nextInt(13);

        System.out.print("Card in your hand is : "+ showCard(first_card)+" and "+ showCard(second_card));


    }

    public int getCardValue(int card)
    {
        int result = card;
        switch (card)
        {
            case 11:
            case 12:
            case 13:
                result =  10;
        }
        return result;
    }
    public String showCard(int card)
    {
        switch (card)
        {
            case 1:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "??";
        }
    }
}
