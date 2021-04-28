package com.jessestolk;

public class Tandem  extends Bike{

    private static int aantalPersonen = 1;


    public static int getAantalPersonen() {
        return aantalPersonen;
    }

    public static void setAantalPersonen(int aantalPersonen) {
        Tandem.aantalPersonen = aantalPersonen;
    }

    public static void tandemDrive(int power) {
        if(getAantalPersonen() == 2){
            drive(power * getAantalPersonen());
        } else {
            drive(power);
        }
    }
}
