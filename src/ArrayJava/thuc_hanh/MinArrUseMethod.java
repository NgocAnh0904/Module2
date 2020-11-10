package ArrayJava.thuc_hanh;

public class MinArrUseMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 9, 77};
        int i = minValue(arr);
        System.out.println(i);
    }

    public static int minValue(int array[]) {
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        return min;
    }
}


