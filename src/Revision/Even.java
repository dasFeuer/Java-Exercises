package Revision;

import java.util.Arrays;

public class Even {
    static int findEvenInArray(int[] arr ){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
               num ++;
            }

        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6};
        int result = findEvenInArray(arr);
        System.out.println("There are " + result + " even numbers in array.");

    }
}
