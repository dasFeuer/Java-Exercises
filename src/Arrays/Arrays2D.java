package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int sizeRow = sc.nextInt();
        System.out.println("Enter the size of column: ");
        int sizeCol = sc.nextInt();

        int[][] arr = new int[sizeRow][sizeCol];

        System.out.println("Now enter the numbers according to size and numbers!");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        for(int[] array : arr) {
            System.out.println(Arrays.toString(array));
        }
    }
}
