package Basics3.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        String roomType = scan.nextLine();
        String rating = scan.nextLine();

        int nights = days - 1;
        double price = 0;
        switch (roomType){
            case "room for one person":
                price = nights * 18;
                break;
            case "apartment":
                if (days < 10){
                    price = (nights * 25) * 0.7;
                } else if (days <= 15){
                    price = (nights * 25) * 0.65;
                } else {
                    price = (nights * 25) * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10){
                    price = (nights * 35) * 0.9;
                } else if (days <= 15){
                    price = (nights * 35) * 0.85;
                } else {
                    price = (nights * 35) * 0.8;
                }
                break;
        }

        if (rating.equals("positive")){
            price = price * 1.25;
        } else {
            price = price * 0.9;
        }

        System.out.printf("%.2f", price);
    }
}
