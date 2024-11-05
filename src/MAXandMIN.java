import java.util.Scanner;

public class MAXandMIN {
    public static int largestNumber(int num1, int num2, int num3) {

        int max = num1;

        if(num2 > max) {
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }

        return max;

    }

    public static int smallestNumber(int num1, int num2, int num3) {

        int min = num1;

        if(num2 < min) {
            min = num2;
        }

        if(num3 < min){
            min = num3;
        }

        return min;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();

        int largestNumber = largestNumber(num1, num2, num3);
        int smallestNumber = smallestNumber(num1, num2, num3);

        System.out.println("Max: " + largestNumber);
        System.out.println("Min: " + smallestNumber);

    }
}
