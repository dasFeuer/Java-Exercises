package Revision;

import java.util.Arrays;

public class ConcatTheArray {
    static int[] concat(int[] array){
        int[]ans = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
             ans[i] = array[i];
            ans[i + array.length] = array[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]array = {3, 2, 1};
        int[] answer = concat(array);
        System.out.println(Arrays.toString(answer));
    }
}
