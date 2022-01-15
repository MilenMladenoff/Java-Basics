package Basics6.More;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1Max = Integer.parseInt(scan.nextLine());
        int num2Max = Integer.parseInt(scan.nextLine());
        int num3Max = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= num1Max; i++){
            for (int j = 1; j <= num2Max; j++){
                for (int k = 1; k <= num3Max; k++){
                    boolean isValid = (i % 2 == 0) && ((j == 2) || (j == 3) || (j == 5) || (j == 7)) && (k % 2 ==0);
                    if (isValid){
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
