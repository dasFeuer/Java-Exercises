package BinarySearching;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr, int targetNum){
        int startNum = 0;
        int endNum = arr.length - 1;

        // To find the middle index
        while (startNum <= endNum){
            int middleNum = startNum + (endNum - startNum) / 2;
            if (targetNum < arr[middleNum]) {
                endNum = middleNum - 1;
            } else if (targetNum > arr[middleNum]) {
                startNum = middleNum + 1;
            } else {
                return middleNum;
            }
        }
        System.out.println("The number you are searching for is not found.");
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-22, -3, -1, 5, 7, 8, 9, 11, 15, 17, 19, 22, 24, 27, 31, 32, 35};
        System.out.println("Enter the number to search:");
        int targetNum = sc.nextInt();

        System.out.println("Finding the index of the number using binary search......");
        int answer = binarySearch(arr, targetNum);
        System.out.println(answer);
    }
}
