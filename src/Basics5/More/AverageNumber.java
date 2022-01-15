package Basics5.More;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
        }
        double average = (sum * 1.0) / n;
        System.out.printf("%.2f", average);
    }
}
