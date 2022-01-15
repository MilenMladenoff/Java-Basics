package BasicsExam18122021;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int adults = 0;
        int kids = 0;
        int toysCost = 0;
        int sweatersCost = 0;
        String input = scan.nextLine();
        while (!input.equals("Christmas")){
            int age = Integer.parseInt(input);
            if (age <= 16){
                kids++;
                toysCost += 5;
            } else {
                adults++;
                sweatersCost += 15;
            }
            input = scan.nextLine();
        }
        System.out.printf("Number of adults: %d%nNumber of kids: %d%nMoney for toys: %d%nMoney for sweaters: %d", adults, kids, toysCost, sweatersCost);
    }
}
