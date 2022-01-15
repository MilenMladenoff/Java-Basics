package Basics1.More;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double degrees = Double.parseDouble(scan.nextLine());

        if (degrees < 5.0){
            System.out.println("unknown");
        } else if (degrees <= 11.9){
            System.out.println("Cold");
        } else if (degrees <= 14.9) {
            System.out.println("Cool");
        } else if (degrees <= 20.0) {
            System.out.println("Mild");
        } else if (degrees <= 25.9) {
            System.out.println("Warm");
        } else if (degrees <= 35.0){
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
