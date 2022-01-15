package basics4.More;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;
        for (int i = 1; i <= days; i++){
            int dailyPatients = Integer.parseInt(scan.nextLine());
            if (untreatedPatients > treatedPatients && i % 3 == 0){
                doctors += 1;
            }
            if (dailyPatients <= doctors){
                treatedPatients += dailyPatients;
            } else {
                treatedPatients += doctors;
                untreatedPatients += dailyPatients - doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
