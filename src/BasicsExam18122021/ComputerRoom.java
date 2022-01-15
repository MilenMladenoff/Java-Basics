package BasicsExam18122021;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int hours = Integer.parseInt(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();
        double pricePerHour = 0;
        switch (month){
            case "march":
            case "april":
            case "may":
                if (dayTime.equals("day")){
                    pricePerHour = 10.5;
                } else {
                    pricePerHour = 8.4;
                }
                break;
            case "june":
            case "july":
            case "august":
                if (dayTime.equals("day")){
                    pricePerHour = 12.6;
                } else {
                    pricePerHour = 10.2;
                }
                break;
        }
        if (people >= 4){
            pricePerHour = pricePerHour * 0.9;
        }
        if (hours >= 5){
            pricePerHour = pricePerHour / 2;
        }
        double totalPrice = pricePerHour * people * hours;
        System.out.printf("Price per person for one hour: %.2f%n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f", totalPrice);
    }
}
