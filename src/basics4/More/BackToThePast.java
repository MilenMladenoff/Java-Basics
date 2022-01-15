package basics4.More;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inheritance = Double.parseDouble(scan.nextLine());
        int lastYear = Integer.parseInt(scan.nextLine());

        double evenYearsSpend = 0;
        double oddYearsSpend = 0;
        int age = 17;
        for (int i = 1800; i <= lastYear; i++){
            if (i % 2 == 0){
                evenYearsSpend += 12000;
            } else {
                age += 2;
                oddYearsSpend += 12000 + 50 * age;
            }
        }
        double neededMoney = evenYearsSpend + oddYearsSpend;
        double diff = Math.abs(inheritance - neededMoney);
        if (inheritance >= neededMoney){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }
    }
}
