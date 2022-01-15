package Exam19072020;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int joineryQuantity = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String delivery = scan.nextLine();
        double orderPrice = 0;
        if (joineryQuantity < 10){
            System.out.println("Invalid order");
        } else {
            switch (type){
                case "90X130":
                    if (joineryQuantity <= 30){
                        orderPrice = 110 * joineryQuantity;
                    } else if (joineryQuantity <= 60){
                        orderPrice = (110 * joineryQuantity) * 0.95;
                    } else {
                        orderPrice = (110 * joineryQuantity) * 0.92;
                    }
                    break;
                case "100X150":
                    if (joineryQuantity <= 40){
                        orderPrice = 140 * joineryQuantity;
                    } else if (joineryQuantity <= 80){
                        orderPrice = (140 * joineryQuantity) * 0.94;
                    } else {
                        orderPrice = (140 * joineryQuantity) * 0.9;
                    }
                    break;
                case "130X180":
                    if (joineryQuantity <= 20){
                        orderPrice = 190 * joineryQuantity;
                    } else if (joineryQuantity <= 50){
                        orderPrice = (190 * joineryQuantity) * 0.93;
                    } else {
                        orderPrice = (190 * joineryQuantity) * 0.88;
                    }
                    break;
                case "200X300":
                    if (joineryQuantity <= 25){
                        orderPrice = 250 * joineryQuantity;
                    } else if (joineryQuantity <= 50){
                        orderPrice = (250 * joineryQuantity) * 0.91;
                    } else {
                        orderPrice = (250 * joineryQuantity) * 0.86;
                    }
                    break;
            }
            if (delivery.equals("With delivery")){
                orderPrice = orderPrice + 60;
            }
            if (joineryQuantity >= 100){
                orderPrice = orderPrice * 0.96;
            }
            System.out.printf("%.2f BGN", orderPrice);
        }
    }
}
