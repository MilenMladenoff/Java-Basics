package Exam16062019;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int income = 0;
        while (!input.equals("Movie time!")){
            int currentSeats = Integer.parseInt(input);
            if (capacity < currentSeats){
                break;
            }
            capacity -= currentSeats;
            int currentProfit = currentSeats * 5;
            if (currentSeats % 3 == 0){
                currentProfit = currentProfit - 5;
            }
            income += currentProfit;
            input = scan.nextLine();
        }
        if (input.equals("Movie time!")){
            System.out.printf("There are %d seats left in the cinema.%n", capacity);
        } else {
            System.out.println("The cinema is full.");
        }
        System.out.printf("Cinema income - %d lv.", income);
    }
}
