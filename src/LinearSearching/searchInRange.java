package LinearSearching;

public class searchInRange {
    public static void main(String[] args) {

        int[] arr = {2,5,88,44,2,9,7,22,53,67};
        int target = 9;
        System.out.println(searchArr(arr, target, 4, 9));

    }
    static int searchArr(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int elements = arr[index];
            if(elements == target){
                return index;
            }
        }
        return -1;
    }
}
