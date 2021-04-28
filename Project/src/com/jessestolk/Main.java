package com.jessestolk;

public class Main {

    public static void main(String[] args) {
        System.out.println("Opdracht 1: ");
        System.out.println("Hello World!");

        System.out.println("Opdracht 2: ");
        Utils.sayHello();
        System.out.println("Opdracht 3:");
        Utils.showNumbers();

        System.out.println("Opdracht 4:");
        Utils.higherThanTwo(2);
        Utils.higherThanTwo(5);

        System.out.println("Opdracht 5:");
        Utils.higherThanTwo("twee");
        Utils.higherThanTwo("vier");
        Utils.higherThanTwo("acht");

        System.out.println("Opdracht 6:");
        System.out.println("Bike:");
        Bike.drive(9.9f);

        System.out.println("Opdracht 7:");
        System.out.println("Tandem:");
        Tandem tandem = new Tandem();
        Tandem.tandemDrive(4);
        Tandem.setAantalPersonen(2);
        Tandem.tandemDrive(4);

        System.out.println("EBike:");
        Ebike ebike = new Ebike();
        Ebike.ebikeDrive(2);
        Ebike.setBattery(0);
        Ebike.ebikeDrive(2);

    }
}
