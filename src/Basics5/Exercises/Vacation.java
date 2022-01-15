package Basics5.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scan.nextLine());
        double initialMoney = Double.parseDouble(scan.nextLine());
        int days = 0;
        int spendDays = 0;
        while (initialMoney < neededMoney){
            if (spendDays >= 5){
                break;
            }
            String action = scan.nextLine();
            double actionMoney = Double.parseDouble(scan.nextLine());
            days++;
            if (action.equals("spend")){
                spendDays++;
                initialMoney -= actionMoney;
            } else {
                spendDays = 0;
                initialMoney += actionMoney;
            }
            if (initialMoney < 0){
                initialMoney = 0;
            }
        }
        if (spendDays >= 5){
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if (initialMoney >= neededMoney){
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
