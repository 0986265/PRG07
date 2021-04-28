package com.jessestolk;

public class Utils {

    public static void sayHello(){
        System.out.println("Hello!");
    }

    public static void showNumbers(){
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(i);
        }
    }

    public static void higherThanTwo(int number){
        if(number <= 2) {
            System.out.println("Het nummer is niet hoger dan 2, het is namelijk: " + number);
        } else{
            System.out.println("Het nummer is hoger dan 2, het is namelijk: " + number);
        }
    }

    public static void higherThanTwo(String number){
        switch (number) {
            case "een", "twee" -> System.out.println("Het nummer is niet hoger dan 2, het is namelijk: " + number);
            case "drie", "vier" -> System.out.println("Het nummer is wel hoger dan 2, het is namelijk: " + number);
            default -> System.out.println("I Dont know this number");
        }
    }
}
