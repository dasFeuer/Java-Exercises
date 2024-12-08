package Revision;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 0, 5, 7, 1};

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }


    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < end; i++) {
            if (start < end) {
                arr[start] = arr[start] + arr[end];
                arr[end] = arr[start] - arr[end];
                arr[start] = arr[start] - arr[end];
                start++;
                end--;
            }

        }
    }
}
