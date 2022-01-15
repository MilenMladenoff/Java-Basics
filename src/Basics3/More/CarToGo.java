package Basics3.More;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String carType = "";
        String carClass = "";
        if (budget <= 100){
            carClass = "Economy class";
            if (season.equals("Summer")){
                carType = "Cabrio";
                budget = budget * 0.35;
            } else {
                carType = "Jeep";
                budget = budget * 0.65;
            }
        } else if (budget <= 500){
            carClass = "Compact class";
            if (season.equals("Summer")){
                carType = "Cabrio";
                budget = budget * 0.45;
            } else {
                carType = "Jeep";
                budget = budget * 0.8;
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            budget = budget * 0.9;
        }

        System.out.printf("%s %n%s - %.2f", carClass, carType, budget);
    }
}
