package com.jessestolk;

public class Ebike extends Bike{

    private static int battery = 100;

    public static int getBattery() {
        return battery;
    }

    public static void setBattery(int battery) {
        Ebike.battery = battery;
    }

    public static void ebikeDrive(int power) {
        if(getBattery() > 0 && getBattery() <= 100){
            drive(power * 2);
        } else {
            drive(power);
        }
    }
}
