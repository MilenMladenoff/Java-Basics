package Basics3.More;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juniors = Integer.parseInt(scan.nextLine());
        int seniors = Integer.parseInt(scan.nextLine());
        String trace = scan.nextLine();

        int allParticipants = seniors +juniors;
        double funds = 0;
        switch (trace) {
            case "trail":
                funds = juniors * 5.5 + seniors * 7;
                break;
            case "cross-country":
                if (allParticipants >= 50) {
                    funds = (juniors * 8 + seniors * 9.5) * 0.75;
                } else {
                    funds = juniors * 8 + seniors * 9.5;
                }
                break;
            case "downhill":
                funds = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                funds = juniors * 20 + seniors * 21.5;
                break;
        }

        double donation = funds * 0.95;
        System.out.printf("%.2f", donation);
    }
}
