package Basics6.More;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= num1; i++){
            for (int j = 1; j <= num1; j++){
                for (int k = 1; k <= num2; k++){
                    for (int l = 1; l <= num2; l++){
                        for (int m = 1; m <= num1; m++){
                            char letter1 = (char)(k + 96);
                            char letter2 = (char)(l + 96);
                            if (m > i && m > j){
                                System.out.printf("%d%d%s%s%d ", i, j, letter1, letter2, m);
                            }
                        }
                    }
                }
            }
        }
    }
}
