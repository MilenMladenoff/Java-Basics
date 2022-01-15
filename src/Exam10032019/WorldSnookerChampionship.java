package Exam10032019;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tournamentStage = scan.nextLine();
        String ticketClass = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        char photo = scan.nextLine().charAt(0);
        double singleTicketPrice = 0;
        boolean isPhotoFree = false;
        switch (tournamentStage){
            case "Quarter final":
                if (ticketClass.equals("Standard")){
                    singleTicketPrice = 55.5;
                } else if (ticketClass.equals("Premium")){
                    singleTicketPrice = 105.2;
                } else {
                    singleTicketPrice = 118.9;
                }
                break;
            case "Semi final":
                if (ticketClass.equals("Standard")){
                    singleTicketPrice = 75.88;
                } else if (ticketClass.equals("Premium")){
                    singleTicketPrice = 125.22;
                } else {
                    singleTicketPrice = 300.4;
                }
                break;
            case "Final":
                if (ticketClass.equals("Standard")){
                    singleTicketPrice = 110.1;
                } else if (ticketClass.equals("Premium")){
                    singleTicketPrice = 160.66;
                } else {
                    singleTicketPrice = 400;
                }
                break;
        }
        double totalSum = tickets * singleTicketPrice;
        if (totalSum > 4000){
            totalSum = totalSum * 0.75;
            isPhotoFree = true;
        } else if (totalSum > 2500){
            totalSum = totalSum * 0.9;
        }
        if (photo == 'Y' && !isPhotoFree){
            totalSum = totalSum + 40 * tickets;
        }
        System.out.printf("%.2f", totalSum);
    }
}
