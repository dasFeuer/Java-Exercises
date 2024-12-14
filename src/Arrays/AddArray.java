package Arrays;

public class AddArray {
    static int addedArray(int[]nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

//    static int addedArray(int[]nums){
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        return sum;
//    }


    public static void main(String[] args) {
        int[]nums = {2, 4, 5, 1, 7};
        int result = addedArray(nums);
        System.out.println(result);
    }
}
