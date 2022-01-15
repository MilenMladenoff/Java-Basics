package basics4.Exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++){
            if (salary > 0){
                String websiteName = scan.nextLine();

                switch (websiteName){
                    case "Facebook":
                        salary = salary - 150;
                        break;
                    case "Instagram":
                        salary = salary - 100;
                        break;
                    case "Reddit":
                        salary = salary - 50;
                        break;
                }
            }
        }

        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
