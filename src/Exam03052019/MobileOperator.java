package Exam03052019;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String term = scan.nextLine();
        String contractType = scan.nextLine();
        String mobileNet = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());
        double monthlyFee = 0;
        switch (contractType){
            case "Small":
                if (term.equals("one")){
                    monthlyFee = 9.98;
                } else {
                    monthlyFee = 8.58;
                }
                break;
            case "Middle":
                if (term.equals("one")){
                    monthlyFee = 18.99;
                } else {
                    monthlyFee = 17.09;
                }
                break;
            case "Large":
                if (term.equals("one")){
                    monthlyFee = 25.98;
                } else {
                    monthlyFee = 23.59;
                }
                break;
            case "ExtraLarge":
                if (term.equals("one")){
                    monthlyFee = 35.99;
                } else {
                    monthlyFee = 31.79;
                }
                break;
        }
        if (mobileNet.equals("yes") && monthlyFee <= 10){
            monthlyFee = monthlyFee + 5.5;
        } else if (mobileNet.equals("yes") && monthlyFee <= 30){
            monthlyFee = monthlyFee + 4.35;
        } else if (mobileNet.equals("yes") && monthlyFee > 30){
            monthlyFee = monthlyFee + 3.85;
        }
        double totalCost = monthlyFee * months;
        if (term.equals("two")){
            totalCost = totalCost * 0.9625;
        }
        System.out.printf("%.2f lv.", totalCost);
    }
}
