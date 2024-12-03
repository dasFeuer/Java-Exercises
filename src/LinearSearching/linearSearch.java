package LinearSearching;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {22,18,6,4,-8,67,90,23,66,54,79};
        int target = -8;
        int ans = searchArr(arr, target);
        int ans2 = searchArr2(arr, target);
        boolean ans3 = searchArr3(arr, target);
        System.out.println("Found at index: " + ans + " with element: " + ans2 );
        System.out.println(ans3);

    }

    //Find the index of the elements in array
    static int searchArr(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int elements = arr[index];
            if(elements == target){
                return index;
            }
        }
        return -1;
    }

    //Find the elements in array
    static int searchArr2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int elements : arr) {
            if (elements == target) {
                return elements;
            }
        }
        return Integer.MAX_VALUE;
    }

    //Return true if exists else false
    static boolean searchArr3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for (int elements : arr) {
            if (elements == target) {
                return true;
            }
        }
        return false;
    }
}
