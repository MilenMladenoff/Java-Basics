package Exam16062019;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++){
            String seriesName = scan.nextLine();
            double seriesPrice = Double.parseDouble(scan.nextLine());
            if (seriesName.equals("Thrones")){
                seriesPrice = seriesPrice / 2;
            } else if (seriesName.equals("Lucifer")){
                seriesPrice = seriesPrice * 0.6;
            } else if (seriesName.equals("Protector")){
                seriesPrice = seriesPrice * 0.7;
            } else if (seriesName.equals("TotalDrama")){
                seriesPrice = seriesPrice * 0.8;
            } else if (seriesName.equals("Area")){
                seriesPrice = seriesPrice * 0.9;
            }
            budget -= seriesPrice;
        }
        if (budget >= 0){
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }
    }
}
