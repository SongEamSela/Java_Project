package TP8_SongeamSela.Ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    String pro_ID;
    String pro_name;
    double pro_price;
    int pro_amount;

    public Product(String pro_ID, String pro_name, double pro_price, int pro_amount) {
        this.pro_ID = pro_ID;
        this.pro_name = pro_name;
        this.pro_price = pro_price;
        this.pro_amount = pro_amount;
    }

    public String getPro_ID() {
        return pro_ID;
    }

    public void setPro_ID(String pro_ID) {
        this.pro_ID = pro_ID;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public double getPro_price() {
        return pro_price;
    }

    public void setPro_price(double pro_price) {
        this.pro_price = pro_price;
    }

    public int getPro_amount() {
        return pro_amount;
    }

    public void setPro_amount(int pro_amount) {
        this.pro_amount = pro_amount;
    }
}
