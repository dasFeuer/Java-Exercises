package Revision;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 4, 6, 8, 9};

        System.out.println("Enter the target number to search the index in array");
        int target = sc.nextInt();

        int answer = binarySearch(arr, target);

        System.out.println(answer);
    }
}
