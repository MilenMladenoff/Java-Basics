package Basics6.More;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);
        char ignore = scan.nextLine().charAt(0);
        int validCount = 0;
        for (char i = start; i <= end; i++){
            for (char j = start; j <= end; j++){
                for (char k = start; k <= end; k++){
                    if ((i != ignore) && (j != ignore) && (k != ignore)){
                        validCount++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
            }
        }
        System.out.println(validCount);
    }
}
