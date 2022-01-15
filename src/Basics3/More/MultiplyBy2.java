package Basics3.More;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());
        while (input >= 0){
            System.out.printf("Result: %.2f%n", input * 2);
            input = Double.parseDouble(scan.nextLine());
            if (input < 0){
                break;
            }
        }
        System.out.println("Negative number!");
    }
}
