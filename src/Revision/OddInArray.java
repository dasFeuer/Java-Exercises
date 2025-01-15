package Revision;


public class OddInArray {
    static void printOddFromArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 5, 9};
        printOddFromArray(array);
    }
}
