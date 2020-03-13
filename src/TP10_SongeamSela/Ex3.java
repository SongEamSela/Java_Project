package TP10_SongeamSela;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float discount=0;
        System.out.print("Input amount of payment : ");
        float money = Float.parseFloat(sc.nextLine());
        if (money<50)
            discount= money-2;
        else if (money>=50 && money>100)
            discount= money-((3.f/100)*money);
        else if (money>=100 && money>200)
            discount= money-( (7.f/100)*money);
        else if (money>=200 && money<500)
            discount= money-((12.f/100)*money);
        else
            discount= money-( (25.f/100)*money);

        System.out.println("After the discount, you have to pay : "+discount+ "$");

    }
}
