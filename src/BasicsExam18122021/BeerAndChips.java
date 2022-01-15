package BasicsExam18122021;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double budget = Double.parseDouble(scan.nextLine());
        int bottles = Integer.parseInt(scan.nextLine());
        int chips = Integer.parseInt(scan.nextLine());
        double allBeerPrice = bottles * 1.2;
        double chipsPrice = allBeerPrice * 0.45;
        double allChipsPrice = Math.ceil(chipsPrice * chips);
        double totalSum = allBeerPrice + allChipsPrice;
        double diff = Math.abs(budget - totalSum);
        if (budget >= totalSum){
            System.out.printf("%s bought a snack and has %.2f leva left.", name, diff);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, diff);
        }
    }
}
