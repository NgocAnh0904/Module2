package ClassAndOOPJava.bai_tap;


import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class StopWatchFix {
    public static class StopWatch{
        private LocalTime startTime;
        private LocalTime endTime;
        //goi thuoc tinh


        public StopWatch() {
        }

        public StopWatch(LocalTime startTime, LocalTime endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public LocalTime getStartTime() {
            return startTime;
        }

        public void setStartTime(LocalTime startTime) {
            this.startTime = startTime;
        }

        public LocalTime getEndTime() {
            return endTime;
        }

        public void setEndTime(LocalTime endTime) {
            this.endTime = endTime;
        }
        public LocalTime start(){
            return this.startTime = java.time.LocalTime.now();
        }
        public LocalTime stop(){
            return this.endTime = java.time.LocalTime.now();
        }
        public long getElapsedTime(){
            return ((this.endTime.toNanoOfDay() - this.startTime.toNanoOfDay())/1000000);
        }


    }
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        LocalTime abc = time.start();


        Scanner input = new Scanner(System.in);
        int[] array = new int[100000];
        int min = 1;
        int max = 1000;
        int range = max - min;
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*range + min);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(abc);
        System.out.println(time.stop());
        System.out.println("The eslapsed is " + time.getElapsedTime() + "ms");
    }

}
