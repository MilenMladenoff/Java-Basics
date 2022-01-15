package Basics5.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialNum = Integer.parseInt(scan.nextLine());
        int numbersSum = 0;
        while (initialNum > numbersSum){
            int number = Integer.parseInt(scan.nextLine());
            numbersSum += number;
        }
        System.out.println(numbersSum);
    }
}
