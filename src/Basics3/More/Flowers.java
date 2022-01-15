package Basics3.More;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int tulips = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        char holiday = scan.nextLine().charAt(0);

        int allFlowers = chrysanthemums + roses + tulips;
        double bouquetPrice = 0;
        switch (season){
            case "Spring":
            case "Summer":
                bouquetPrice = chrysanthemums * 2 + roses * 4.1 + tulips * 2.5;
                break;
            case "Autumn":
            case "Winter":
                bouquetPrice = chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15;
                break;
        }

        if (holiday == 'Y'){
            bouquetPrice = bouquetPrice * 1.15;
        }
        if (tulips > 7 && season.equals("Spring")){
            bouquetPrice = bouquetPrice * 0.95;
        }
        if (roses >= 10 && season.equals("Winter")){
            bouquetPrice = bouquetPrice * 0.9;
        }
        if (allFlowers > 20){
            bouquetPrice = bouquetPrice * 0.8;
        }

        bouquetPrice = bouquetPrice + 2;
        System.out.printf("%.2f", bouquetPrice);
    }
}
