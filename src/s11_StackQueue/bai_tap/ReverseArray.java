package StackQueue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        Stack<Integer> integerStack = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            integerStack.push(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = integerStack.pop();
        }

        System.out.println(Arrays.toString(a));
    }
}