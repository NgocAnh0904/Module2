package loopJava.thuc_hanh;

import java.util.Scanner;

public class IntersetRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        double intersetRate = 1.0;
        int month = 1;
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of month: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        intersetRate = scanner.nextDouble();
        double totalInterset = 0;
        for (int i = 0; i < month; i++) {
            totalInterset += money * (intersetRate / 100) / 12 * month;
            System.out.println("Total of interset: " + totalInterset);
        }

    }
}
