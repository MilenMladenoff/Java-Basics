package Basics3.Exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();

        String outfit = "";
        String shoes = "";
        if (degrees <= 18){
            if (dayTime.equals("Morning")){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (dayTime.equals("Afternoon")){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (degrees > 18 && degrees <= 24){
            if (dayTime.equals("Morning")){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (dayTime.equals("Afternoon")){
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else {
            if (dayTime.equals("Morning")){
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (dayTime.equals("Afternoon")){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
