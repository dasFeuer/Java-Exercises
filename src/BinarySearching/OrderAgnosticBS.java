package BinarySearching;

import java.util.Scanner;

public class OrderAgnosticBS {
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] arr = {-22, -12, -1, 0, 3, 7, 9, 16, 17, 20, 22, 25, 29, 34, 37, 94}; //Asc order
        int[] arr = {99, 82, 71, 63, 57, 49, 33, 25, 11, 1, 0, -2, -44, -59, -77, -93}; //Desc order
        System.out.println("Enter the number to search:");
        int targetNum = sc.nextInt();

        System.out.println("Finding the index of the number using binary search......");
        int answer = orderAgnosticBS(arr, targetNum);
        System.out.println(answer);
    }
}
