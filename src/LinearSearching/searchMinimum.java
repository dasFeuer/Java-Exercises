package LinearSearching;


public class searchMinimum {
    public static void main(String[] args) {
        int[] arr = {2,-5,88,44,-2,9,7,22,-53,67};
        System.out.println(minArr(arr));
    }
    static int minArr(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}
