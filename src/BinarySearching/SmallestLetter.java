package BinarySearching;

import java.util.Scanner;

public class SmallestLetter {
    public static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = {'v', 'x', 'z'};
        System.out.println("Enter the character to search:");
        char target = sc.next().charAt(0);

        System.out.println(nextGreatestLetter(letters, target));

    }
}
