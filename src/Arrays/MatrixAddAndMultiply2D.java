package Arrays;

import java.util.Scanner;

public class MatrixAddAndMultiply2D {

    public static void printTheAddedMatrix(int[][] firstMatrix,
                                           int[][] secondMatrix,
                                           int[][]addMatrix,
                                           int row,
                                           int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                addMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("Added matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out. print(addMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTheMultipliedMatrix(int[][] firstMatrix,
                                           int[][] secondMatrix,
                                           int[][]multiplyMatrix,
                                           int row,
                                           int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                multiplyMatrix[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
            }
        }
        System.out.println("Multiply matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out. print(multiplyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input row: ");
        int row = sc.nextInt();
        System.out.print("Input col: ");
        int col = sc.nextInt();

        int[][] firstMatrix = new int[row][col];
        int[][] secondMatrix = new int[row][col];
        int[][] multiplyMatrix = new int[row][col];
        int[][] addMatrix = new int[row][col];

        System.out.println("Enter the elements for first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements for the second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        printTheAddedMatrix(firstMatrix, secondMatrix, addMatrix, row, col);

        System.out.println("-------------------------------------------------------");
        printTheMultipliedMatrix(firstMatrix, secondMatrix, multiplyMatrix, row, col);
    }
}
