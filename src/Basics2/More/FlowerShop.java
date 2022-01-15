package Basics2.More;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int magnolias = Integer.parseInt(scan.nextLine());
        int hyacinths = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int cacti = Integer.parseInt(scan.nextLine());
        double giftPrice = Double.parseDouble(scan.nextLine());

        double profit = (magnolias * 3.25 + hyacinths * 4 + roses * 3.5 + cacti * 8) * 0.95;
        double diff = Math.abs(profit - giftPrice);

        if (profit >= giftPrice){
            diff = Math.floor(diff);
            System.out.printf("She is left with %.0f leva.", diff);
        } else {
            diff = Math.ceil(diff);
            System.out.printf("She will have to borrow %.0f leva.", diff);
        }


    }
}
