package TP_Note_SongeamSela;

import java.util.Scanner;

public class BookClass {
    String B_name,B_ISBN,B_author,B_Type;
    boolean available;
    public BookClass(){}

    public BookClass(String b_name, String b_ISBN, String b_author, String b_Type) {
        B_name = b_name;
        B_ISBN = b_ISBN;
        B_author = b_author;
        B_Type = b_Type;
    }

    public String getB_name() {
        return B_name;
    }

    public void setB_name(String b_name) {
        B_name = b_name;
    }

    public String getB_ISBN() {
        return B_ISBN;
    }

    public void setB_ISBN(String b_ISBN) {
        B_ISBN = b_ISBN;
    }

    public String getB_author() {
        return B_author;
    }

    public void setB_author(String b_author) {
        B_author = b_author;
    }

    public String getB_Type() {
        return B_Type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setB_Type(String b_Type) {
        B_Type = b_Type;
    }

    public void ShowInfo(){
        System.out.println("\tBook Information\n" +
                "Book Name: "+B_name +
                "\nBook ISBN: " +B_ISBN+
                "\nAuthor of the book: "+B_author +
                "\nType of the book: "+B_Type);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookClass b1 = new BookClass("13 Reason Why","0451478290","Jay Asher","Novel");
        b1.ShowInfo();

        //input by user
        System.out.print("Enter Book Name: "); b1.setB_name(sc.nextLine());
        System.out.print("Enter Book ISBN: "); b1.setB_ISBN(sc.nextLine());
        System.out.print("Enter Book Author: "); b1.setB_author(sc.nextLine());
        System.out.print("Enter Book Type: "); b1.setB_Type(sc.nextLine());

        b1.ShowInfo();
    }
}
