package BinarySearching;

import java.util.Arrays;

public class Sorting {
    static int findTheIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length -1 ;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid -1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 1, 4, 2, 6, 7, 9, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 3;

        int result = findTheIndex(arr, target);
        System.out.println(result);
    }
}
