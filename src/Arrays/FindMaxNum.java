package Arrays;

public class FindMaxNum {
    public static void main(String[] args) {
        int[] arr = {2,1,6,7,9,0};
        System.out.println("The maximum value in array is: " + maxValue(arr));
    }
    static int maxValue(int []arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}
