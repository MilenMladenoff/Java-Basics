package Basics6.More;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        boolean allComboKL = false;
        int max = Integer.parseInt(scan.nextLine());
        int passCount = 0;
        int i = 35;
        int j = 64;
        while (i <= 55){
            while (j <= 96){
                for (int k = 1; k <= a; k++){
                    for (int l = 1; l <= b; l++){
                        char one = (char)i;
                        char two = (char)j;
                        System.out.printf("%c%c%d%d%c%c|", one, two, k, l, two, one);
                        passCount++;
                        i++;
                        j++;
                        if (k == a && l == b){
                            allComboKL = true;
                        }
                        if (passCount >= max || allComboKL){
                            break;
                        }
                        if (i > 55){
                            i = 35;
                        }
                        if (j > 96){
                            j = 64;
                        }
                    }
                    if (passCount >= max || allComboKL){
                        break;
                    }
                }
                if (passCount >= max || allComboKL){
                    break;
                }
            }
            if (passCount >= max || allComboKL){
                break;
            }
        }
    }
}
