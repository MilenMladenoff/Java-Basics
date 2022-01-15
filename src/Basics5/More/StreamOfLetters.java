package Basics5.More;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String word = "";
        boolean isC = false;
        boolean isO = false;
        boolean isN = false;
        while (!input.equals("End")){
            char letter = input.charAt(0);
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')){
                switch (input){
                    case "c":
                        if (isC){
                            word += input;
                        }
                        isC = true;
                        break;
                    case "o":
                        if (isO){
                            word += input;
                        }
                        isO = true;
                        break;
                    case "n":
                        if (isN){
                            word += input;
                        }
                        isN = true;
                        break;
                    default:
                        word += input;
                        break;
                }
                if (isC && isO && isN){
                    System.out.print(word +" ");
                    word = "";
                    isC = false;
                    isO = false;
                    isN = false;
                }
            }
            input = scan.nextLine();
        }
    }
}
