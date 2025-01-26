package Revision;

import java.util.Scanner;

public class BitManipulation {
    public static void manipulation(int operation){
        int x = 5;
        int position = 1;

        int bitMask = 1<<position;
        if(operation == 1){
            int newNum = bitMask | x;
            System.out.println(newNum);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & x;
            System.out.println(newNumber);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        manipulation(operation);
    }
}
