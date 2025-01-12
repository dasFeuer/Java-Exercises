package BinarySearching;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {

    // Check for first occurrence if target first

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = search(nums,target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // This function just returns the index value of target

    static int search(int[] nums, int target, boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){

            // Find the middle element

            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if(findFirstIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //     index = 0, 1, 2, 3, 4
        int[] nums = { 5, 7, 8, 8, 9};
        System.out.println("Enter the number to search:");
        int target = sc.nextInt(); // target = 8, ans = [2, 3]

        System.out.println("Finding the index of the number using binary search......");
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
