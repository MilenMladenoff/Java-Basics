package Basics6.More;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int controlNum = Integer.parseInt(scan.nextLine());
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int correctNumCounter = 0;
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                for (int k = 1; k <= 9; k++){
                    for (int l = 1; l <= 9; l++){
                        if ((i * j + k * l == controlNum) && (i < j && k > l)){
                            correctNumCounter++;
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            if (correctNumCounter == 4){
                                a = i;
                                b = j;
                                c = k;
                                d = l;
                            }
                        }
                    }
                }
            }
        }
        if (correctNumCounter >= 4){
            System.out.printf("%nPassword: %d%d%d%d%n", a, b, c, d);
        } else {
            System.out.printf("%nNo!%n");
        }
    }
}
