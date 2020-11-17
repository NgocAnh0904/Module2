package loopJava.bai_tap;

import java.util.Scanner;

public class N20 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int nNumber = 20;
        int count = 0;
        int N = 2;
        while (count < nNumber) {
            int temp = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    temp++;
                }
            }
            if (temp == 2) {
                System.out.println(N);
                count++;
            }
            N++;
        }


    }
}

