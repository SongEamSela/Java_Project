package TP12_SongeamSela;

import java.time.LocalDate;

public class Travel {

    //distance = Km, speed = Km/h
    double distance,speed;

    public Travel(double distance, double speed) {
        this.distance = distance;
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public static void main(String[] args) {
        Travel ab = new Travel(30,20);
        LocalDate currentDate = LocalDate.now();
        double congestionRate =Math.random()*100;
        if (currentDate.getDayOfWeek().equals("MONDAY")||
                currentDate.getDayOfWeek().equals("TUESDAY")||
                currentDate.getDayOfWeek().equals("WEDNESDAY")||
                currentDate.getDayOfWeek().equals("THURSDAY")||
                currentDate.getDayOfWeek().equals("FRIDAY")){
            congestionRate = ((congestionRate%40)+10)/100.0;
        }
        else
            congestionRate =((congestionRate%50)+50)/100.0;

        double duration = ab.distance/(ab.speed * congestionRate);


        System.out.println("Duration of travel is "+duration+" h");
    }
}
