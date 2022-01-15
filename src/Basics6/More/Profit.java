package Basics6.More;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coins1 = Integer.parseInt(scan.nextLine());
        int coins2 = Integer.parseInt(scan.nextLine());
        int coins5 = Integer.parseInt(scan.nextLine());
        int amount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= coins1; i++){
            for (int j = 0; j <= coins2; j++){
                int coins2Sum = j * 2;
                for (int k = 0; k <= coins5; k++){
                    int coins5Sum = k * 5;
                    if ((i + coins2Sum + coins5Sum) == amount){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, amount);
                    }
                }
            }
        }
    }
}
