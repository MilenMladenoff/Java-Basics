package Basics6.Exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int primeNumSum = 0;
        int nonPrimeNumSum = 0;
        while (!input.equals("stop")){
            int currentNum = Integer.parseInt(input);
            if (currentNum < 0){
                System.out.println("Number is negative.");
                input = scan.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= currentNum; i++){
                if (currentNum % i == 0){
                    count++;
                }
            }
            if (count == 2){
                primeNumSum += currentNum;
            } else {
                nonPrimeNumSum += currentNum;
            }
            input = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeNumSum);
    }
}
