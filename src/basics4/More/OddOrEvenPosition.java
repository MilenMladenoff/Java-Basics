package basics4.More;

import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++){
            double num = Double.parseDouble(scan.nextLine());
            if (i % 2 != 0){
                oddSum += num;
                if (num < oddMin){
                    oddMin = num;
                }
                if (num > oddMax){
                    oddMax = num;
                }
            } else {
                evenSum += num;
                if (num < evenMin){
                    evenMin = num;
                }
                if (num > evenMax){
                    evenMax = num;
                }
            }
        }
//        System.out.printf("OddSum=%.2f, ", oddSum);
//        if (n == 0){
//            System.out.print("OddMin=No, ");
//        } else {
//            System.out.printf("OddMin=%.2f, ", oddMin);
//        }
//        if (n == 0){
//            System.out.print("OddMax=No, ");
//        } else {
//            System.out.printf("OddMax=%.2f, ", oddMax);
//        }
//        System.out.printf("EvenSum=%.2f, ", evenSum);
//        if (n == 1){
//            System.out.print("EvenMin=No, ");
//        } else {
//            System.out.printf("EvenMin=%.2f, ", evenMin);
//        }
//        if (n == 1){
//            System.out.print("EvenMax=No, ");
//        } else {
//            System.out.printf("EvenMax=%.2f", evenMax);
//        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (n == 0){
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (n == 0){
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (n <= 1){
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (n <= 1){
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}
