package BinarySearching;

import java.util.Scanner;

public class Ceiling {

    // Return the index: Smallest number => target

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end  = arr.length - 1;

        if(target > arr[arr.length - 1]){
            return -1;
        }

        while (start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                end = middle - 1;
            } else if (target > arr[middle]){
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 5, 6, 7, 9, 12, 17, 19, 21, 25};
        System.out.println("Enter the number to search:");
        int targetNum = sc.nextInt();

        System.out.println("Finding the index of the number using binary search......");
        int answer = ceiling(arr, targetNum);
        System.out.println(answer);
    }
}
