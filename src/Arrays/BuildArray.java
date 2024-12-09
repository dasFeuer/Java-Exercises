package Arrays;

import java.util.Arrays;

// Building the array from the permutation
public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] result = buildTheArray(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] buildTheArray(int[] nums){
        int[]ans = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            ans[index] = nums[nums[index]];
        }
        return ans;
    }
}
