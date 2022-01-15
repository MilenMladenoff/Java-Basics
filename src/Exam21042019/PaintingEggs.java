package Exam21042019;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String size = scan.nextLine();
        String color = scan.nextLine();
        int packs = Integer.parseInt(scan.nextLine());
        int packPrice = 0;
        switch (size){
            case "Large":
                if (color.equals("Red")){
                    packPrice = 16;
                } else if (color.equals("Green")){
                    packPrice = 12;
                } else {
                    packPrice = 9;
                }
                break;
            case "Medium":
                if (color.equals("Red")){
                    packPrice = 13;
                } else if (color.equals("Green")){
                    packPrice = 9;
                } else {
                    packPrice = 7;
                }
                break;
            case "Small":
                if (color.equals("Red")){
                    packPrice = 9;
                } else if (color.equals("Green")){
                    packPrice = 8;
                } else {
                    packPrice = 5;
                }
                break;
        }
        double totalCost = (packPrice * packs) * 0.65;
        System.out.printf("%.2f leva.", totalCost);
    }
}
