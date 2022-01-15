package basics4.More;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int months = Integer.parseInt(scan.nextLine());
        double electricityTotal = 0;
        double otherTotal = 0;
        double waterBill = 20;
        double internetBill = 15;
        double totalExpenses =0;
        for (int i = 1; i <= months; i++){
            double electricityBill = Double.parseDouble(scan.nextLine());
            double other = (waterBill + internetBill + electricityBill) * 1.2;
            totalExpenses += waterBill + internetBill + electricityBill + other;
            electricityTotal += electricityBill;
            otherTotal += other;
        }
        System.out.printf("Electricity: %.2f lv%n", electricityTotal);
        System.out.printf("Water: %.2f lv%n", waterBill * months);
        System.out.printf("Internet: %.2f lv%n", internetBill * months);
        System.out.printf("Other: %.2f lv%n", otherTotal);
        System.out.printf("Average: %.2f lv", totalExpenses / months);
    }
}
