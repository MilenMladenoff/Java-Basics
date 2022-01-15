package Exam07072019;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        double maxPoints = 0;
        String mostPowerfulWord = "";
        while (!word.equals("End of words")){
            double points = 0;
            for (int i = 0; i < word.length(); i++){
                char letter = word.charAt(i);
                points += letter;
            }
            char firstLetter = word.charAt(0);
            if (firstLetter == 'A' || firstLetter == 'a' || firstLetter == 'E' || firstLetter == 'e' || firstLetter == 'I' || firstLetter == 'i' || firstLetter == 'O' || firstLetter == 'o'
                    || firstLetter == 'U' || firstLetter == 'u' || firstLetter == 'Y' || firstLetter == 'y'){
                points = points * word.length();
            } else {
                points = Math.floor(points / word.length());
            }
            if (maxPoints <= points){
                maxPoints = points;
                mostPowerfulWord = word;
            }
            word = scan.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, maxPoints);
    }
}
