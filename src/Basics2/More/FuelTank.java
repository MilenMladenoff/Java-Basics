package Basics2.More;

import java.util.Locale;
import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fuelType = scan.nextLine();
        int liters = Integer.parseInt(scan.nextLine());

        switch (fuelType){
            case "Gasoline":
            case "Diesel":
            case "Gas":
                if (liters >= 25){
                    System.out.printf("You have enough %s.", fuelType.toLowerCase(Locale.ROOT));
                } else {
                    System.out.printf("Fill your tank with %s!", fuelType.toLowerCase(Locale.ROOT));
                }
                break;
            default:
                System.out.println("Invalid fuel!");
        }
    }
}
