package introductionJava.thuc_hanh;

import java.util.Scanner;

public class DateMonthInYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month " + month + " have 31 Day.");
                break;
            case 2:
                System.out.printf("Month %d have 28 or 29 Day.", month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month " + month + " have 30 Day.");
                break;
        }
    }
}
