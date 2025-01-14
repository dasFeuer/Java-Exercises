package Revision;

public class SumAllNumbersInArray {
    static int sumArray(int[] arr){
        int adder = 0;
        for (int i = 0; i < arr.length; i++) {
            adder += arr[i];
        }
        return adder;
    }

    static double avgValueOfSum(int[] arr){
        if(arr.length == 0) {
            throw new IllegalArgumentException("Array is empty so the average value cannot be calculated");
        }
        return (double) sumArray(arr) / arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 9, 5, 7, 3, 5};
        int answer = sumArray(arr);
        double avg = avgValueOfSum(arr);
        System.out.println("SUM: " + answer);
        System.out.printf("AVERAGE: %.3f%n", avg);
    }
}
