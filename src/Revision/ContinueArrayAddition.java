package Revision;

import java.util.Arrays;

public class ContinueArrayAddition {
    public static int[] continuousAdd(int[] array){
        int adder = 0;
        for (int i = 0; i < array.length; i++) {
            adder += array[i];
            array[i] = adder;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 0, 7, 4};
        int[] answer = continuousAdd(array);
        System.out.println(Arrays.toString(answer));
    }
}
