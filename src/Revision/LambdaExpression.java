package Revision;

import java.util.Scanner;

interface SumCalculator {
    int sum(int a, int b);
}

public class LambdaExpression {
    public static void sumTheNumbers(int num1, int num2){
        SumCalculator calculator = (a, b) -> a + b;
        int result = calculator.sum(num1, num2);
        System.out.println("Sum: " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sumTheNumbers(num1, num2);
    }
}
