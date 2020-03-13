public class TP3_Ex3 {
    public static void main(String[] args) {
        System.out.printf("\nA.\n");
        print_A("* * * * * * * * * * * * * * * * * * * * *\n");
        print_A("*                                       *\n");
        print_A("*                                       *\n");
        print_A("*                                       *\n");
        print_A("*                                       *\n");
        print_A("* * * * * * * * * * * * * * * * * * * * *\n");
        System.out.printf("\nB.\n");
        print_B();
        System.out.printf("\nC.\n");
        print_C();
        System.out.printf("\nD.\n");
        print_D();
        System.out.printf("\nE.\n");
        print_E();
        System.out.printf("\nF.\n");
        print_F();
        System.out.printf("\nG.\n");
        print_G();
        System.out.printf("\nH.\n");
        print_H();
    }
    public static void print_A(String s){
        System.out.printf(s);

    }
    public static void print_B(){
        System.out.printf(
                "    *\n" +
                "   ***\n" +
                "  *****\n" +
                " *******\n" +
                "*********\n");
    }
    public static void print_C(){
        System.out.printf(
                "\n*\n" +
                "***\n" +
                "*****\n" +
                "*******\n" +
                "*********\n");
    }
    public static void print_D(){
        System.out.printf(
                "\n        *\n" +
                "      ***\n" +
                "    *****\n" +
                "  *******\n" +
                "*********\n");
    }
    public static void print_E(){
        System.out.printf(
                "    *\n" +
                "  ***\n" +
                "*****\n" +
                "  ***\n" +
                "    *\n");
    }
    public static void print_F(){
        System.out.printf(
                "  *\n" +
                " ***\n" +
                "*****\n" +
                " ***\n" +
                "  *\n");
    }
    public static void print_G(){
        System.out.printf
                ("*****\n" +
                " ***\n" +
                "  *\n" +
                " ***\n" +
                "*****\n");
    }
    public static void print_H(){
        System.out.printf(
                "    *\n"+
                "  *   *\n"+
                "*       *\n"+
                "  *   *\n"+
                "    *\n");
    }
}
