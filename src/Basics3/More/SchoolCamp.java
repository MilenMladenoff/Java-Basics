package Basics3.More;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        String group = scan.nextLine();
        int students = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());

        String sport = "";
        double price = 0;
        switch (season){
            case "Winter":
                if (group.equals("girls")){
                    sport = "Gymnastics";
                    price = students * nights * 9.6;
                } else if (group.equals("boys")){
                    sport = "Judo";
                    price = students * nights * 9.6;
                } else {
                    sport = "Ski";
                    price = students * nights * 10;
                }
                break;
            case "Spring":
                if (group.equals("girls")){
                    sport = "Athletics";
                    price = students * nights * 7.2;
                } else if (group.equals("boys")){
                    sport = "Tennis";
                    price = students * nights * 7.2;
                } else {
                    sport = "Cycling";
                    price = students * nights * 9.5;
                }
                break;
            case "Summer":
                if (group.equals("girls")){
                    sport = "Volleyball";
                    price = students * nights * 15;
                } else if (group.equals("boys")){
                    sport = "Football";
                    price = students * nights * 15;
                } else {
                    sport = "Swimming";
                    price = students * nights * 20;
                }
        }

        if (students >= 10 && students < 20){
            price = price * 0.95;
        } else if (students >= 20 && students < 50){
            price = price * 0.85;
        } else if (students >= 50){
            price = price / 2;
        }

        System.out.printf("%s %.2f lv.", sport, price);

    }
}
