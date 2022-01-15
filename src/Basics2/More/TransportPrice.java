package Basics2.More;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();

        double dayTaxi = 0.7 + n * 0.79;
        double nightTaxi = 0.7 + n * 0.9;
        double bus = n * 0.09;
        double train = n * 0.06;
        double taxiPrice = 0.0;

        if (time.equals("day")){
            taxiPrice = dayTaxi;
        } else {
            taxiPrice = nightTaxi;
        }

        if (n < 20){
            System.out.printf("%.2f", taxiPrice);
        } else if (n < 100){
            System.out.printf("%.2f", bus);
        } else {
            System.out.printf("%.2f", train);
        }
    }
}
