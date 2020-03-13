package TP13_SongeamSela.Task2;

public class Newspaper extends ReadingMaterial {

    String author, publisher, dateOfPublication,newspaper_company;

    public Newspaper(String title, int publication_year, String author, String publisher, String dateOfPublication, String newspaper_company) {
        super(title, publication_year);
        this.author = author;
        this.publisher = publisher;
        this.dateOfPublication = dateOfPublication;
        this.newspaper_company = newspaper_company;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getNewspaper_company() {
        return newspaper_company;
    }

    public void setNewspaper_company(String newspaper_company) {
        this.newspaper_company = newspaper_company;
    }
}
