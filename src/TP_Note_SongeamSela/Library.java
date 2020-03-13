package TP_Note_SongeamSela;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<BookCategory> ListCategory;

    public void ListAllCategory(){
        System.out.println("\tList Category");
        for (int i=0;i<ListCategory.size();i++){
            System.out.println((i+1)+". "+ListCategory.get(i).C_name);
        }
    }
    public void ListBookByCat(String cat){
        System.out.println("\tList Book By Category");
        for (int i=0;i<ListCategory.size();i++){
            if (ListCategory.get(i).C_name.equals(cat)){
                System.out.println("\t"+ListCategory.get(i).C_name);
                for (int j=0;j<ListCategory.get(i).BookList.size();j++){
                    ListCategory.get(i).ListBook();
                }
            }
        }
    }
    public void ListBookByAuthor(String author){
        System.out.println("\tList Book By Author");
        for (int i=0;i<ListCategory.size();i++){
            for (int j=0;j<ListCategory.get(i).BookList.size();j++){
                if (ListCategory.get(i).BookList.get(j).B_author.equals(author)){
                    ListCategory.get(i).BookList.get(j).ShowInfo();
                 }
            }
        }
    }
    public void ListBorrowedBook(){
        for (int i=0;i<ListCategory.size();i++){
            for (int j=0;j<ListCategory.get(i).BookList.size();j++){
                if (!ListCategory.get(i).BookList.get(j).available){
                    ListCategory.get(i).BookList.get(j).ShowInfo();
                }
            }
        }
    }
    public void AddNewBook(){
        Scanner sc = new Scanner(System.in);
        boolean findcat=false;
        System.out.println("\tAdd New Book to category\n");
        System.out.println("Enter Book category: ");
        String cat = sc.nextLine();
        for (int i=0;i<ListCategory.size();i++){
            if (ListCategory.get(i).C_name.equals(cat)){
                findcat = true;
                System.out.print("Enter book name: ");
                String name = sc.nextLine();
                System.out.print("Enter book author: ");
                String author = sc.nextLine();
                System.out.print("Enter ISBN: ");
                String isbn = sc.nextLine();
                System.out.print("Enter book type: ");
                String bType = sc.nextLine();
                BookClass b = new BookClass(name,isbn,author,bType);
                b.setAvailable(false);
                ListCategory.get(i).BookList.add(b);
            }
        }
        if (!findcat){
            
        }
    }
}
