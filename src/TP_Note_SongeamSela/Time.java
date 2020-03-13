package TP_Note_SongeamSela;

import java.util.Scanner;

public class Time {
    int hour,minute,second;
    public Time(){}
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time DiffTime(Time t){
        int diffTime = (hour*3600+minute*60+second) - (t.hour*3600+t.minute*60+t.second);
        Time diff = new Time();
        if (diffTime<0){
            diffTime = diffTime * -1;
            diff.setHour(diffTime/3600);
            diff.setMinute((diffTime%3600)/60);
            diff.setSecond((diffTime%60)%60);
        }
        else {
            diff.setHour(diffTime/3600);
            diff.setMinute((diffTime%3600)/60);
            diff.setSecond((diffTime%60)%60);
        }
        return diff;
    }

    public Time IncreaseTime(int second){
        Time NewTime = new Time();
        int addTime = (hour*3600+minute*60+second) + second;
        NewTime.setHour(addTime/3600);
        NewTime.setMinute((addTime%3600)/60);
        NewTime.setSecond((addTime%60)%60);
        return NewTime;
    }
    public static void main(String[] args) {
        Time t = new Time();
        System.out.println("Calculation the different between 2 times");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a time\n");
        System.out.print("Hour: "); t.setHour(Integer.parseInt(sc.nextLine()));
        System.out.print("Minute: "); t.setMinute(Integer.parseInt(sc.nextLine()));
        System.out.print("Second: "); t.setSecond(Integer.parseInt(sc.nextLine()));

        Time t1 = new Time();
        System.out.print("Enter another time\n");
        System.out.print("Hour: "); t1.setHour(Integer.parseInt(sc.nextLine()));
        System.out.print("Minute: "); t1.setMinute(Integer.parseInt(sc.nextLine()));
        System.out.print("Second: "); t1.setSecond(Integer.parseInt(sc.nextLine()));

        System.out.print("Different between this two time is : " +
                t.DiffTime(t1).getHour()+"h:"+t.DiffTime(t1).getMinute()+ "mn:"+t.DiffTime(t1).getSecond()+"s");

        System.out.println("Calculate the increasing of time");
        Time t2 = new Time();
        System.out.print("Enter a time\n");
        System.out.print("Hour: "); t1.setHour(Integer.parseInt(sc.nextLine()));
        System.out.print("Minute: "); t1.setMinute(Integer.parseInt(sc.nextLine()));
        System.out.print("Second: "); t1.setSecond(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter increasing seconds:"); int sec = Integer.parseInt(sc.nextLine());

        System.out.println("The time increases to "+
                t2.IncreaseTime(sec).getHour()+"h:"+t2.IncreaseTime(sec).getMinute()+ "mn:"+t2.IncreaseTime(sec).getSecond()+"s");


    }
}
