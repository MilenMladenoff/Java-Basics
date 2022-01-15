package Basics1.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int cats = Integer.parseInt(scan.nextLine());
        double amount = dogs * 2.5 + cats * 4;
        System.out.printf("%f lv.", amount);
    }
}
