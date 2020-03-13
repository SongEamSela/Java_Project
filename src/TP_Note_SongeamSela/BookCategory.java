package TP_Note_SongeamSela;

import java.util.ArrayList;

public class BookCategory {
    String C_name,C_descri;
    ArrayList<BookClass> BookList;

    public BookCategory(String c_name, String c_descri, ArrayList<BookClass> bookList) {
        C_name = c_name;
        C_descri = c_descri;
        BookList = bookList;
    }
    public void ListBook(){
        System.out.println("\tList of all books");
        for (int i=0;i<BookList.size();i++){
            BookList.get(i).ShowInfo();
        }
    }
    public void FindBook(String title_OR_author){
        for (int i=0;i<BookList.size();i++){
            if (BookList.get(i).B_name.equals(title_OR_author) | BookList.get(i).B_author.equals(title_OR_author)){
                BookList.get(i).ShowInfo();
            }
        }
    }
    public int CountBook(){
        return BookList.size();
    }
}
