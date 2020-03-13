package TP13_SongeamSela.Task3;

public class Coffee extends Liquid {

    @Override
    public void add(Liquid amt) {
        list.add(amt);
    }

    @Override
    public Liquid remove(int amt) {
        return null;
    }

    @Override
    public Liquid removeAll() {
        return null;
    }

    @Override
    public String flavor() {
        return "Bitter";
    }

    public static void main(String[] args) {
        Liquid MyFavoriteBeverage = new Coffee();
        MyFavoriteBeverage .add(new Milk());
    }
}
