package Basics6.More;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hundreds = Integer.parseInt(scan.nextLine());
        int tens = Integer.parseInt(scan.nextLine());
        int units = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= hundreds; i++){
            for (int j = 1; j <= tens; j++){
                for (int k = 1; k <= units; k++){
                    if (((i % 2 == 0) && (k % 2 == 0)) && (j == 2 || j == 3 || j == 5 || j == 7)){
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
