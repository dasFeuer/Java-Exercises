package Arrays;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {22, 2, 0, 5, 9};

        swap(arr, 0, 4);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
            arr[index1] = arr[index1] + arr[index2];
            arr[index2] = arr[index1] - arr[index2];
            arr[index1] = arr[index1] - arr[index2];


    }
}
