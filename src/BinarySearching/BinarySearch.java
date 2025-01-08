package BinarySearching;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr, int targetNum){
        int start = 0;
        int end = arr.length - 1;

        // To find the middle index
        while (start <= end){
            int middleNum = start + (end - start) / 2;
            if (targetNum < arr[middleNum]) {
                end = middleNum - 1;
            } else if (targetNum > arr[middleNum]) {
                start = middleNum + 1;
            } else {
                return middleNum;
            }
        }
        System.out.println("The number that you are searching for doesn't found at any index.");
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-22, -3, -1, 5, 7, 8, 9, 11, 15, 17, 19, 22, 24, 27, 31, 32, 35};
        int target = sc.nextInt();

        System.out.println("Finding the index of the number with binary search......");
        int answer = binarySearch(arr, target);
        System.out.println(answer);
    }
}
