package Revision;

import java.util.Arrays;

public class TwoSumArray {
    public static int []addSumArray(int[] array, int target){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == target){
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 7};
        int target = 10;
        int[]answer = addSumArray(array, target);
        System.out.println(Arrays.toString(answer));

    }
}
