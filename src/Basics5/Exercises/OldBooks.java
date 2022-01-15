package Basics5.Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String favBook = scan.nextLine();
        String inputBook = scan.nextLine();
        int bookCount = 0;
        boolean isFound = false;
        while (!inputBook.equals("No More Books")){
            if (inputBook.equals(favBook)){
                isFound = true;
                break;
            }
            bookCount++;
            inputBook = scan.nextLine();
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}
