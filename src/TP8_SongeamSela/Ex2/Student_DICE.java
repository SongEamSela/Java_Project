package TP8_SongeamSela.Ex2;

public class Student_DICE {
    String st_name;
    int st_age;
    String st_id;
    String st_gender;
    String st_group;

    public Student_DICE(String st_name, int st_age, String st_id, String st_gender, String st_group) {
        this.st_name = st_name;
        this.st_age = st_age;
        this.st_id = st_id;
        this.st_gender = st_gender;
        this.st_group = st_group;
    }
    public Student_DICE(){ }

    //operations/methods
    public void requestPermission(){
        System.out.println("Find Majeur's phone number. " +
                "Then, call for permission.");
    }
    public boolean requestFreeServiceRoom(){
        System.out.println("If room is free");
        return true;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public int getSt_age() {
        return st_age;
    }

    public void setSt_age(int st_age) {
        this.st_age = st_age;
    }

    public String getSt_id() {
        return st_id;
    }

    public void setSt_id(String st_id) {
        this.st_id = st_id;
    }

    public String getSt_gender() {
        return st_gender;
    }

    public void setSt_gender(String st_gender) {
        this.st_gender = st_gender;
    }

    public String getSt_group() {
        return st_group;
    }

    public void setSt_group(String st_group) {
        this.st_group = st_group;
    }

}
