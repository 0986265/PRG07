package com.jessestolk;

public class Bike {

    private static int speed;

    public int getSpeed() {
        return speed;
    }

    public static void setSpeed(int i) {
        speed = i;
    }

    public static void drive(float power) {
        setSpeed((int)power * 10);
        System.out.println(speed);
    }

}
