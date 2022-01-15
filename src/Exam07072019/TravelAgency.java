package Exam07072019;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        String packageType = scan.nextLine();
        String vipStatus = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double pricePerDay = 0;
        switch (packageType){
            case "noEquipment":
                pricePerDay = 80;
                if (vipStatus.equals("yes")){
                    pricePerDay = pricePerDay * 0.95;
                }
                break;
            case "withEquipment":
                pricePerDay = 100;
                if (vipStatus.equals("yes")){
                    pricePerDay = pricePerDay * 0.9;
                }
                break;
            case "noBreakfast":
                pricePerDay = 100;
                if (vipStatus.equals("yes")){
                    pricePerDay = pricePerDay * 0.93;
                }
                break;
            case "withBreakfast":
                pricePerDay = 130;
                if (vipStatus.equals("yes")){
                    pricePerDay = pricePerDay * 0.88;
                }
                break;
        }
        if (days > 7){
            days = days - 1;
        }
        double totalPrice = days * pricePerDay;
        if (!packageType.equals("noBreakfast") && !packageType.equals("withBreakfast") && !packageType.equals("noEquipment") && !packageType.equals("withEquipment")){
            System.out.println("Invalid input!");
        } else if (!destination.equals("Bansko") && !destination.equals("Borovets") && !destination.equals("Varna") && !destination.equals("Burgas")){
            System.out.println("Invalid input!");
        } else if (((destination.equals("Bansko") || destination.equals("Borovets")) && (packageType.equals("noBreakfast") || packageType.equals("withBreakfast"))) ||
                ((destination.equals("Varna") || destination.equals("Burgas")) && (packageType.equals("noEquipment") || packageType.equals("withEquipment")))){
            System.out.println("Invalid input!");
        } else if (days < 1){
            System.out.println("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
        }
    }
}
