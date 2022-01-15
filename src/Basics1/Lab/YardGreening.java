package Basics1.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double amount = area * 7.61;
        double discount = amount * 0.18;
        double total = amount - discount;
        System.out.printf("The final price is: %f lv.%n" + "The discount is: %f lv.", total, discount);
    }
}
