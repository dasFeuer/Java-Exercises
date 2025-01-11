package BinarySearching;

import java.util.Scanner;

public class Floor {

    // Return the index: Greatest number <= target

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 5, 6, 7, 9, 12, 17, 19, 21, 25};
        System.out.println("Enter the number to search:");
        int targetNum = sc.nextInt();

        System.out.println("Finding the index of the number using binary search......");
        int answer = floor(arr, targetNum);
        System.out.println(answer);
    }
}
