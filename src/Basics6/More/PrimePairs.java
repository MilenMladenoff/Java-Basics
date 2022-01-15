package Basics6.More;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pair1Start = Integer.parseInt(scan.nextLine());
        int pair2Start = Integer.parseInt(scan.nextLine());
        int pair1Diff = Integer.parseInt(scan.nextLine());
        int pair2Diff = Integer.parseInt(scan.nextLine());
        int pair1End = pair1Start + pair1Diff;
        int pair2End = pair2Start + pair2Diff;
        for (int i = pair1Start; i <= pair1End; i++){
            for (int j = pair2Start; j <= pair2End; j++){
                boolean iIsPrime = false;
                boolean jIsPrime = false;
                int iCount = 0;
                int jCount = 0;
                for (int k = 1; k <= i; k++){
                    if (i % k == 0){
                        iCount++;
                    }
                }
                if (iCount == 2){
                    iIsPrime = true;
                }
                for (int l = 1; l <= j; l++){
                    if (j % l == 0){
                        jCount++;
                    }
                }
                if (jCount == 2){
                    jIsPrime = true;
                }
                if (iIsPrime && jIsPrime){
                    System.out.printf("%d%d%n", i, j);
                }
            }
        }
    }
}
