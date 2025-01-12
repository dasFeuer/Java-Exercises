package BinarySearching;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {

    // Check for first occurrence if target first

    static int[] searchTheRange(int[] numbers, int targetNumber){
        int[] answer = {-1, -1};
        answer[0] = search(numbers, targetNumber, true);
        if(answer[0] != -1){
            answer[1] = search(numbers, targetNumber, false);
        }
        return answer;
    }

    // This function just returns the index value of target

    static int search(int[] numbers, int targetNumber, boolean findTheFirstIndex){
        int answer = -1;
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end){

            // Find the middle element

            int mid = start + (end - start) / 2;

            if(targetNumber < numbers[mid]){
                end = mid - 1;
            } else if(targetNumber > numbers[mid]){
                start = mid + 1;
            } else {
                answer = mid;
                if(findTheFirstIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //     index = 0, 1, 2, 3, 4
        int[] numbers = { 5, 7, 8, 8, 9};
        System.out.println("Enter the number to search:");
        int targetNumber = sc.nextInt(); // targetNumber = 8, ans = [2, 3]

        System.out.println("Finding the first and last index using binary search...");
        int[] ans = searchTheRange(numbers, targetNumber);
        System.out.println(Arrays.toString(ans)); // [2, 3]
    }
}
