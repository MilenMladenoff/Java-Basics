package Basics6.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int combos = 0;
        boolean isFound = false;
        for (int i = start; i <= end; i++){
            for (int j = start; j <= end; j++){
                combos++;
                if (i + j == magicNum){
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combos, i, j, magicNum);
                    break;
                }
            }
            if (isFound){
                break;
            }
        }
        if (!isFound){
            System.out.printf("%d combinations - neither equals %d", combos, magicNum);
        }
    }
}
