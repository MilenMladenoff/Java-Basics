package Basics2.More;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int totalFood = Integer.parseInt(scan.nextLine());
        double dogFood = Double.parseDouble(scan.nextLine());
        double catFood = Double.parseDouble(scan.nextLine());
        double turtleFood = Double.parseDouble(scan.nextLine());

        double necessaryFood = dogFood * days + catFood * days + (turtleFood / 1000) * days;
        double diff = Math.abs(totalFood - necessaryFood);

        if (totalFood >= necessaryFood){
            diff = Math.floor(diff);
            System.out.printf("%.0f kilos of food left.", diff);
        } else {
            diff = Math.ceil(diff);
            System.out.printf("%.0f more kilos of food are needed.", diff);
        }

    }
}
