package Basics6.More;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int combosCount = 0;
        boolean isMagic = false;
        for (int i = start; i <= end; i++){
            for (int j = start; j <= end; j++){
                combosCount++;
                if ((i + j) == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)", combosCount, i, j, magicNum);
                    isMagic = true;
                    break;
                }
            }
            if (isMagic){
                break;
            }
        }
        if (!isMagic){
            System.out.printf("%d combinations - neither equals %d", combosCount, magicNum);
        }
    }
}
