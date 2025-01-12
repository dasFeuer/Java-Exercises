package BinarySearching;

import java.util.Scanner;

public class InfiniteArray {
    static int ans(int[] arr, int targetNum){

        //This throw ArrayIndexOutOfBoundException

        int start = 0;
        int end = 1;
        while (targetNum > arr[end]){
            int newStart = end + 1;
            end = end + ( end - start + 1) * 2;
            start = newStart;
        }
        return infiniteArray(arr, targetNum, start, end);

        //This doesn't throw ArrayIndexOutOfBoundException

//        int start = 0;
//        int end = 1;
//
//        while (end < arr.length && targetNum > arr[end]){
//            int newStart = end + 1;
//            end = end + (end - start + 1) * 2;
//            if(end >= arr.length){
//                end = arr.length - 1;
//            }
//            start = newStart;
//        }
//        return infiniteArray(arr, targetNum, start, end);

    }
    static int infiniteArray(int[] arr, int targetNum, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(targetNum < arr[mid]){
                end = mid - 1;
            } else if(targetNum > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 5, 7, 8, 9, 11, 15, 17, 20};
        System.out.println("Enter the number to search:");
        int targetNum = sc.nextInt();

        int theAnswer = ans(arr, targetNum);
        System.out.println(theAnswer);

    }
}
