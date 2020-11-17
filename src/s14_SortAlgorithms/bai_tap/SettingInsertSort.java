package SortAlgorithms.bai_tap;

import java.util.Arrays;

public class SettingInsertSort {
    public static void main(String[] args) {


        int[] a = {2, 7, 8, 9, 1, -5};

        // len^2 => O(n^2)
        for (int i = 1; i < a.length; i++) { // n

            int curElement = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) { // n
                if (curElement < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = curElement;
        }

        System.out.println(Arrays.toString(a));
    }
//    public void sort(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 1; i < n; ++i) {
//            int key = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//            System.out.println("Vòng lặp thứ " + i);
//            for (int k = 0; k < n; ++k){
//                System.out.print(arr[k] + " ");
//                System.out.println();
//            }
//        }
//    }
//    static void printArray(int arr[])
//    {
//        System.out.println("Kết quả: ");
//        int n = arr.length;
//        for (int i = 0; i < n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//    public static void main(String args[])
//    {
//        int arr[] = { 12, 11, 13, 5, 6 };
//        InsertSort ob = new InsertSort();
//        ob.sort(arr);
//        printArray(arr);
//    }
}
