package Revision;

import java.util.Arrays;

public class SwapRevision {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 0, 1};
        swapIndex(arr, 3, 4);
        System.out.println(Arrays.toString(arr));
    }


    static void swapIndex(int[] arr, int firstIndex, int secondIndex) {
        arr[firstIndex] = arr[firstIndex] + arr[secondIndex];
        arr[secondIndex] = arr[firstIndex] - arr[secondIndex];
        arr[firstIndex] = arr[firstIndex] - arr[secondIndex];

    }
}
