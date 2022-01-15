package Exam21042019;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggsInStore = Integer.parseInt(scan.nextLine());
        String act = scan.nextLine();
        int soldEggs = 0;
        while (!act.equals("Close")){
            int eggsChange = Integer.parseInt(scan.nextLine());
            if (act.equals("Buy") && eggsChange <= eggsInStore){
                eggsInStore -= eggsChange;
                soldEggs += eggsChange;
            } else if (act.equals("Buy") && eggsChange > eggsInStore){
                System.out.println("Not enough eggs in store!");
                System.out.printf("You can buy only %d.", eggsInStore);
                break;
            }
            if (act.equals("Fill")){
                eggsInStore += eggsChange;
            }
            act = scan.nextLine();
        }
        if (act.equals("Close")){
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }
    }
}
