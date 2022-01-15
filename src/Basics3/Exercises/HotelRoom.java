package Basics3.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int nightsQuantity = Integer.parseInt(scan.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;
        switch (month){
            case "May":
            case "October":
                if (nightsQuantity <= 7){
                    studioPrice = nightsQuantity * 50;
                    apartmentPrice = nightsQuantity * 65;
                } else if (nightsQuantity <= 14) {
                    studioPrice = (nightsQuantity * 50) * 0.95;
                    apartmentPrice = nightsQuantity * 65;
                } else {
                    studioPrice = (nightsQuantity * 50) * 0.7;
                    apartmentPrice = (nightsQuantity * 65) * 0.9;
                }
                break;
            case "June":
            case "September":
                if (nightsQuantity <= 14) {
                    studioPrice = nightsQuantity * 75.2;
                    apartmentPrice = nightsQuantity * 68.7;
                } else {
                    studioPrice = (nightsQuantity * 75.2) * 0.8;
                    apartmentPrice = (nightsQuantity * 68.7) * 0.9;
                }
                break;
            case "July":
            case "August":
                if (nightsQuantity <= 14) {
                    studioPrice = nightsQuantity * 76;
                    apartmentPrice = nightsQuantity * 77;
                } else {
                    studioPrice = nightsQuantity * 76;
                    apartmentPrice = (nightsQuantity * 77) * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartmentPrice, studioPrice);
    }
}
