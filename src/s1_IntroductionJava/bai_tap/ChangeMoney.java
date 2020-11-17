package introductionJava.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        int VND = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter change from USD to VND: ");
        int USD = scanner.nextInt();
        int Change = USD * VND;
        System.out.println("Changed: " + Change + "VND");
    }
}
