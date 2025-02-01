package Revision;

import java.util.Scanner;

public class TableOfTheNumber {
    public static void printTable(int number, int sNumber, int eNumber){
        if(number == 0){
            System.out.println("Multiplication of a 0 is always a 0.");
            return;
        } else {
                for (int i = sNumber; i <= eNumber ; i++) {
                    System.out.println(number + " X " + i + " = " + number * i);
                }
        }
        System.out.println("Table completed!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter the number for the Table: ");
            int number = sc.nextInt();

            System.out.print("From which number do you want to start the Table: ");
            int sNumber = sc.nextInt();

            System.out.print("Enter the end number for the Table: ");

            int eNumber = sc.nextInt();
            printTable(number, sNumber, eNumber);

            System.out.print("Do you want to continue the program? (Y/N): ");
            String action  = sc.next().toLowerCase();

            if(action.equals("n")){
                System.out.println("Program over!");
                return;
            } else {
                System.out.println("Here we go again!");
            }
        }
    }
}
