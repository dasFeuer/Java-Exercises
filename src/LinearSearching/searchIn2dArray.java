package LinearSearching;

import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3 ,83, 2},
                {44, 9, 1, 7},
                {7, 79, 3, 27, 78},
                {5, 8}
        };
        int target = 27;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(searchMax(arr));


    }
    static int[] search(int[][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};
    }

    static int searchMax(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }

        }
        return max;
    }

//    static int searchMax1(int[][]arr){
//        int max = Integer.MIN_VALUE;
//        for (int[] ints : arr) {
//            for (int elements : ints) {
//                if (elements > max) {
//                    max = elements;
//                }
//            }
//
//        }
//        return max;
//    }

}
