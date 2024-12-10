package Arrays;

import java.util.Arrays;

public class RunningSum {
    static int[] add(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
    public static void main(String[] args) {

        int[] nums = {2,3,2,1,2,1};
        int[]ans = add(nums);
        System.out.println(Arrays.toString(ans));
    }
}
