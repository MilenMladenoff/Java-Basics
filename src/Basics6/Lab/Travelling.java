package Basics6.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        while (!destination.equals("End")){
            double budget = Double.parseDouble(scan.nextLine());
            double savedMoney = 0;
            while (budget > savedMoney){
                double currentMoney = Double.parseDouble(scan.nextLine());
                savedMoney += currentMoney;
            }
            System.out.println("Going to " + destination + "!");
            destination = scan.nextLine();
        }
    }
}
