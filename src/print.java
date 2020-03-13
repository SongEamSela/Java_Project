import java.util.Scanner;

public class print {
    static int n=1;
    public static void main(String[] args) {
        int i=5;
        i-=n;
        for (; i>=5;i--){
            System.out.println(i);
        }




        System.out.printf("Hello Sela !!!!\n");
        Scanner s=new Scanner(System.in);

        System.out.printf("Input Name: ");
        String name=s.nextLine();//read a single line

        System.out.printf("Hello %s!!",name);

        System.out.printf("\nInput Age: ");
        int a=s.nextInt();//read one int separate by space/ enter
        s.nextLine();//take new line out

        System.out.printf("You are %d years old!",a);

        s.close();

    }
}
