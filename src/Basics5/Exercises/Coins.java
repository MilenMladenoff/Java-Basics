package Basics5.Exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double change = Double.parseDouble(scan.nextLine());
        int coinsCount = 0;
        double cents = change * 100;
        cents = Math.round(cents);
        while (cents > 0){
            if (cents >= 200){
                cents -= 200;
                coinsCount++;
            } else if (cents >= 100){
                cents -= 100;
                coinsCount++;
            } else if (cents >= 50){
                cents -= 50;
                coinsCount++;
            } else if (cents >= 20){
                cents -= 20;
                coinsCount++;
            } else if (cents >= 10){
                cents -= 10;
                coinsCount++;
            } else if (cents >= 5){
                cents -= 5;
                coinsCount++;
            } else if (cents >= 2){
                cents -= 2;
                coinsCount++;
            } else if (cents >= 1){
                cents -= 1;
                coinsCount++;
            }
        }
        System.out.println(coinsCount);
    }
}
