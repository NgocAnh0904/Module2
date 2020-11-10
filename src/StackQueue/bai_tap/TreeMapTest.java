package StackQueue.bai_tap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String str = scanner.nextLine();
        String[] a = str.split(" ");
        Map<String, Integer> map = new TreeMap<>();
//        Map la Abstract Class k tao duoc Obj, nen dung TreeMap de ep kieu ngam dinh
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        System.out.println(map);
    }
}
