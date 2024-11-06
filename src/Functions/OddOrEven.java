package Functions;

import java.util.Scanner;

public class OddOrEven {
    public static boolean isOddorEven(int number){
        if (number % 2 == 0) {
            System.out.println("Number is even.");
            return true;
        } else {
            System.out.println("Number is odd.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Even is true and Odd is false");
        System.out.print("Enter the number to find out if the entered number is odd or even: ");
        int number = sc.nextInt();

        boolean result = isOddorEven(number);
        System.out.println(result);
    }
}
