package Revision;

import java.util.Arrays;

public class ArrayReverse {
    public static int[] arrayReverse(int[] array){

        int start = 0;
        int end = array.length - 1;
        for (int i = 0; i < end; i++) {
            array[start] = array[start] + array[end];
            array[end] = array[start] - array[end];
            array[start] = array[start] - array[end];
            start ++;
            end--;
        }
         return array;
    }
    public static char[] arrayCharReverse(char[] chars){

        int start = 0;
        int end = chars.length - 1;
        for (int i = 0; i < end; i++) {
            chars[start] = (char) (chars[start] + chars[end]);
            chars[end] = (char) (chars[start] - chars[end]);
            chars[start] = (char) (chars[start] - chars[end]);
            start ++;
            end--;
        }
         return chars;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arrayReverse(array)));

        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString(arrayCharReverse(chars)));
    }
}
