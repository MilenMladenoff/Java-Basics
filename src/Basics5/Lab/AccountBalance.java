package Basics5.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double totalSum = 0;
        while (!input.equals("NoMoreMoney")){
            double installment = Double.parseDouble(input);
            if (installment < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", installment);
            totalSum += installment;
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f%n", totalSum);
    }
}
