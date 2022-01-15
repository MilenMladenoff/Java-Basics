package Basics3.More;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String destination = "";
        String accommodation = "";
        switch (season){
            case "Summer":
                destination = "Alaska";
                break;
            case "Winter":
                destination = "Morocco";
        }

        if (budget <= 1000){
            accommodation = "Camp";
            if (season.equals("Summer")){
                budget = budget * 0.65;
            } else {
                budget = budget * 0.45;
            }
        } else if (budget <= 3000){
            accommodation = "Hut";
            if (season.equals("Summer")){
                budget = budget * 0.8;
            } else {
                budget = budget * 0.6;
            }
        } else {
            accommodation = "Hotel";
            budget = budget * 0.9;
        }

        System.out.printf("%s - %s - %.2f", destination, accommodation, budget);
    }
}
