package SearchingAlgorithms.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise_22_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
//            Phương thức charAt() trả về giá trị Char của chuỗi tại
//            vị trí có chỉ số index được chỉ định được chỉ định. Index bắt đầu từ 0.
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }
}
