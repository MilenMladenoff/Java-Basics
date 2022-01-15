package Basics3.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        double ticketPrice = 0;
        switch (projection){
            case "Premiere":
                ticketPrice = 12;
                break;
            case "Normal":
                ticketPrice = 7.5;
                break;
            case "Discount":
                ticketPrice = 5;
                break;
        }

        int seats = rows * columns;
        double income = seats * ticketPrice;
        System.out.printf("%.2f leva", income);
    }
}
