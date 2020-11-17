package introductionJava.thuc_hanh;

import java.util.Scanner;

public class RectangularArea {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inter width: ");
        width = scanner.nextFloat();
//   nextfloat là gì? Scanner scanner = new Scanner(System.in);?
        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);

    }
}
