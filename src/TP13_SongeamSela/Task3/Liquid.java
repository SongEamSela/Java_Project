package TP13_SongeamSela.Task3;

import java.util.ArrayList;

public abstract class Liquid {
    ArrayList <Liquid> list;
    public abstract void add( Liquid amt);
    public abstract Liquid remove (int amt);
    public abstract Liquid removeAll();
    public abstract String flavor();
}
