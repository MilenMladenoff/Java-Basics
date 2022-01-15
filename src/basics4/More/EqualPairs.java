package basics4.More;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pairsQuantity = Integer.parseInt(scan.nextLine());
        int pairSum = 0;
        int previousSum = 0;
        int maxDiff = 0;
        for (int i = 1; i <= pairsQuantity; i++){
            int num1 = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());
            pairSum = num1 + num2;
            if (i == 1){
                previousSum = pairSum;
            }
            int diff = Math.abs(previousSum - pairSum);
            if (diff > maxDiff){
                maxDiff = diff;
            }
            previousSum = pairSum;
        }
        if (maxDiff == 0){
            System.out.println("Yes, value=" + pairSum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
