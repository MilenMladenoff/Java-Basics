package Basics6.More;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char sector = scan.nextLine().charAt(0);
        int rows = Integer.parseInt(scan.nextLine());
        int oddSeats = Integer.parseInt(scan.nextLine());
        int evenSeats = oddSeats + 2;
        int totalSeats = 0;
        for (char i = 'A'; i <= sector; i++){
            if (i > 'A'){
                rows++;
            }
            for (int j = 1; j <= rows; j++){
                if (j % 2 == 0){
                    for (int k = 1; k <= evenSeats; k++){
                        char seat = (char)(k + 96);
                        System.out.printf("%c%d%c%n", i, j, seat);
                        totalSeats++;
                    }
                } else {
                    for (int k = 1; k <= oddSeats; k++){
                        char seat = (char)(k + 96);
                        System.out.printf("%c%d%c%n", i, j, seat);
                        totalSeats++;
                    }
                }
            }
        }
        System.out.println(totalSeats);
    }
}
