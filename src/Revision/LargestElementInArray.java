package Revision;

import java.util.ArrayList;
import java.util.Collections;

public class LargestElementInArray {
    public static int largestNum(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static Integer largestNum2(int[] array){
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            newArrayList.add(array[i]);
            }
        return Collections.max(newArrayList);
    }
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 9, 1, 7};
        int answer = largestNum(array);
        int answer2 = largestNum2(array);
        System.out.println("Largest number in array is " + answer);
        System.out.println("Largest number in array is " + answer2);
    }
}
