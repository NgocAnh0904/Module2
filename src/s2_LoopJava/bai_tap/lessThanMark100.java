package loopJava.bai_tap;

public class lessThanMark100 {
    public static void main(String[] args) {
        for (int N = 2; N <= 100; N++){
            boolean check = false;
            for (int i = 2; i <= Math.sqrt(N); i++){
                check = false;
                if (N % i == 0){
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.println(N + " is prime");
            }
        }
    }
}
