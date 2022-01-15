package Exam07042019;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int voucherAmount = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int ticketsCounter = 0;
        int otherPurchasesCounter = 0;
        while (!input.equals("End")){
            if (input.length() > 8){
                voucherAmount = voucherAmount - (input.charAt(0) + input.charAt(1));
                if (voucherAmount < 0){
                    break;
                }
                ticketsCounter++;
            } else {
                voucherAmount = voucherAmount - input.charAt(0);
                if (voucherAmount < 0){
                    break;
                }
                otherPurchasesCounter++;
            }
            input = scan.nextLine();
        }
        System.out.println(ticketsCounter);
        System.out.println(otherPurchasesCounter);
    }
}
