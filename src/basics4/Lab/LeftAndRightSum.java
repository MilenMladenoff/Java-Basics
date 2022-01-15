package basics4.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int leftSum = 0;
        for (int i =0; i < n; i++){
            int number = Integer.parseInt(scan.nextLine());
            leftSum += number;
        }
        int rightSum = 0;
        for (int i =0; i < n; i++){
            int number = Integer.parseInt(scan.nextLine());
            rightSum += number;
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
        }
    }
}
