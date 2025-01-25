package Revision;

import java.util.Scanner;

public class PascalTriangle {
    public static void printTriangle(int userInput){
        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= userInput - i; j++) {
                System.out.print(" ");
            }

            int combination = 1;
            for (int l = 1; l <= i; l++) {
                System.out.print(combination + " ");
                combination = combination * (i - l) / l;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        printTriangle(userInput);
    }
}
