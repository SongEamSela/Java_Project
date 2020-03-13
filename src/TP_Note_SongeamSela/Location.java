package TP_Note_SongeamSela;

import java.util.Scanner;

public class Location {
    float longitude,latitude;

    public Location(float longitude, float latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }
    public void ShowData(){
       System.out.println("Coordinates Longitude = " + longitude+", Latitude = "+ latitude);
    }

    public static void main(String[] args) {
        Location l1 = new Location(0,0);
        l1.ShowData();

        //get input from user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Coordinate longitude : "); l1.setLongitude(Float.parseFloat(sc.nextLine()));
        System.out.print("Enter the Coordinate longitude : "); l1.setLatitude(Float.parseFloat(sc.nextLine()));

        //implement accessor to access to the attribute
        System.out.println("Coordinates Longitude = " + l1.getLongitude()+", Latitude = "+ l1.getLatitude());


    }
}
