package Basics2.More;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fuelType = scan.nextLine();
        double liters = Double.parseDouble(scan.nextLine());
        String card = scan.nextLine();

        double fuelPrice = 0;
        if (fuelType.equals("Gas")){
            if (card.equals("No")){
                fuelPrice = liters * 0.93;
            } else {
                fuelPrice = liters * 0.85;
            }
        } else if (fuelType.equals("Gasoline")){
            if (card.equals("No")){
                fuelPrice = liters * 2.22;
            } else {
                fuelPrice = liters * 2.04;
            }
        } else if (fuelType.equals("Diesel")){
            if (card.equals("No")){
                fuelPrice = liters * 2.33;
            } else {
                fuelPrice = liters * 2.21;
            }
        }

        if (liters >= 20 && liters <= 25){
            fuelPrice = fuelPrice * 0.92;
        } else if (liters > 25){
            fuelPrice = fuelPrice * 0.90;
        }

        System.out.printf("%.2f lv.", fuelPrice);


    }
}
