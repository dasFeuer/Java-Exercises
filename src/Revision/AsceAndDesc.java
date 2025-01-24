package Revision;

import java.util.Arrays;
import java.util.Collections;

public class AsceAndDesc {
    public static void asceArray(Integer[] array){
        System.out.println("Original Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Ascending Array: " + Arrays.toString(array));
    }
    public static void descArray(Integer[] array){
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Descending Array: " + Arrays.toString(array));
    }
    public static void main(String[] args) {
        Integer[] array = {4, 1, 0, 5, 2, 10, 9, 8, 7, 6, 3};
        asceArray(array);
        System.out.println("---------------------------------------------------");
        descArray(array);
    }
}
