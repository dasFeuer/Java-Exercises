package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the size of an Array: ");
        
        int size = sc.nextInt();
        
        System.out.println("You have given the size: " + size);
        
        int[] num = new int[size];

        System.out.print("Input the number according to size: ");
        for (int i = 0; i < num.length; i++) {

            num[i] = sc.nextInt();

        }

        System.out.println("You have given this number: " + Arrays.toString(num));

        for (int arr : num) {
            System.out.print(arr + " ");

        }

    }
    
}
