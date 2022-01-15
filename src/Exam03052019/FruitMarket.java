package Exam03052019;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double strawberriesPrice = Double.parseDouble(scan.nextLine());
        double bananasKilos = Double.parseDouble(scan.nextLine());
        double orangesKilos = Double.parseDouble(scan.nextLine());
        double raspberriesKilos = Double.parseDouble(scan.nextLine());
        double strawberriesKilos = Double.parseDouble(scan.nextLine());
        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice * 0.6;
        double bananasPrice = raspberriesPrice * 0.2;
        double totalSum = strawberriesKilos * strawberriesPrice + bananasKilos * bananasPrice + raspberriesKilos * raspberriesPrice + orangesPrice * orangesKilos;
        System.out.printf("%.2f", totalSum);
    }
}
