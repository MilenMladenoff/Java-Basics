package Exam16062019;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double dailyPrice = 0;
        switch (destination){
            case "Dubai":
                if (season.equals("Winter")){
                    dailyPrice = 45000;
                } else {
                    dailyPrice = 40000;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")){
                    dailyPrice = 17000;
                } else {
                    dailyPrice = 12500;
                }
                break;
            case "London":
                if (season.equals("Winter")){
                    dailyPrice = 24000;
                } else {
                    dailyPrice = 20250;
                }
                break;
        }
        double totalPrice = dailyPrice * days;
        if (destination.equals("Dubai")){
            totalPrice = totalPrice * 0.7;
        }
        if (destination.equals("Sofia")){
            totalPrice = totalPrice * 1.25;
        }
        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }
    }
}
