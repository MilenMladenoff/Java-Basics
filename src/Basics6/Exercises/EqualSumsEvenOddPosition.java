package Basics6.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int lastNum = Integer.parseInt(scan.nextLine());
        for (int i = firstNum; i <= lastNum; i++){
            String currentNum = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNum.length(); j++){
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0){
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum){
                System.out.print(i + " ");
            }
        }
    }
}
