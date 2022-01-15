package Exam16062019;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());;
        String actor = scan.nextLine();
        double wage = 0;
        while (!actor.equals("ACTION")){
            if (actor.length() <= 15){
                wage = Double.parseDouble(scan.nextLine());
                if (budget < wage){
                    break;
                }
            } else {
                wage = budget * 0.2;
            }
            budget -= wage;
            actor = scan.nextLine();
        }
        if (actor.equals("ACTION")){
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", wage - budget);
        }
    }
}
