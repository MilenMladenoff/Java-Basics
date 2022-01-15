package Basics5.More;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bottlesDetergent = Integer.parseInt(scan.nextLine());
        int detergentQuantity = bottlesDetergent * 750;
        String input = scan.nextLine();
        int washCount = 0;
        int dishes = 0;
        int pots = 0;
        int detergentSpend = 0;
        while (!input.equals("End")){
            washCount++;
            int currentWash = Integer.parseInt(input);
            if (washCount % 3 == 0){
                pots += currentWash;
                detergentSpend += currentWash * 15;
            } else {
                dishes += currentWash;
                detergentSpend += currentWash * 5;
            }
            if (detergentSpend > detergentQuantity){
                break;
            }
            input = scan.nextLine();
        }
        int diff = Math.abs(detergentQuantity - detergentSpend);
        if (detergentSpend <= detergentQuantity){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%nLeftover detergent %d ml.", dishes, pots, diff);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", diff);
        }
    }
}
