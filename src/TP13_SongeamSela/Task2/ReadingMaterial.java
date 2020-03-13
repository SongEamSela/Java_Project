package TP13_SongeamSela.Task2;

public abstract class ReadingMaterial {
    String title;
    int publication_year;

    public ReadingMaterial(String title, int publication_year) {
        this.title = title;
        this.publication_year = publication_year;
    }
}
