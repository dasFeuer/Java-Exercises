package Revision;

import java.util.Scanner;

public class PrintOddNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Input the number according to the size: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printOdd(arr);
    }
    static void printOdd(int[] arr) {
        System.out.println("The odd numbers from user input are: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                System.out.print((arr[i] + " "));
            }
        }
    }
}
