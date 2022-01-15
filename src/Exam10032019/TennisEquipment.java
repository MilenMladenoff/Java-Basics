package Exam10032019;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        double racketPrice = Double.parseDouble(scan.nextLine());
//        int rackets = Integer.parseInt(scan.nextLine());
//        int shoes = Integer.parseInt(scan.nextLine());
//        double shoesPrice = racketPrice / 6;
//        double totalSum = (racketPrice * rackets + shoesPrice * shoes) * 1.2;
//        double playerShare = totalSum / 8;
//        double sponsorsShare = Math.ceil(totalSum - playerShare);
//        System.out.println(String.format("Price to be paid by Djokovic %.0f", Math.floor(playerShare)));
//        System.out.println(String.format("Price to be paid by sponsors %.0f", sponsorsShare));
        double rocketPrice = Double.parseDouble(scan.nextLine());
        int rocketCount = Integer.parseInt(scan.nextLine());
        int sneakersCount = Integer.parseInt(scan.nextLine());

        double rocketsPrice = rocketPrice * rocketCount;
        double sneakersPrice = sneakersCount * (rocketPrice / 6);
        double otherStuffPrice = (rocketsPrice + sneakersPrice) * 0.2;

        double totalSum = rocketsPrice + sneakersPrice + otherStuffPrice;
        double moneyPaidByDjokovic = Math.floor(totalSum / 8);
        double moneyPaidBySponsors = Math.ceil((totalSum / 8) * 7);
        System.out.println(String.format("Price to be paid by Djokovic %.0f", moneyPaidByDjokovic));
        System.out.println(String.format("Price to be paid by sponsors %.0f", moneyPaidBySponsors));
    }
}