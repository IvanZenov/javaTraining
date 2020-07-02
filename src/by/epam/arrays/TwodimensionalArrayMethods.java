package by.epam.arrays;

import java.util.Arrays;

public class TwodimensionalArrayMethods {

    public static int [][] formSequenceMatrix(int n){
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i += 2) {
            int k = n - 1;
            for (int j = 0; j < n; j++) {
                result[i][j] = j + 1;
                result[i + 1][k] = j + 1;
                k--;
            }
        }
        return result;
    }


    public static int[][] formMultiplyDiagonalMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 0;

        for (int i = 0; i < n; i++) {
            num = (i + 1) * (i + 2);
            result[i][i] = num;
        }

        return result;
    }

    public static int[][] formPyramidMatrix(int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                result[i][j] = 1;
                result[n - i - 1][j] = 1;
            }
        }
        return result;
    }

    private double[][] formRealMatrix(double[] arr) { //double because Math.pow
        double[][] arrayOut = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arrayOut[i][j] = Math.pow(arr[j], i + 1);
            }
        }
        return arrayOut;
    }

    private int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[firstMatrix.length][firstMatrix[0].length];

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                int numFirstMatrix = firstMatrix[i][j];
                int numSecondMatrix = secondMatrix[i][j];

                result[i][j] = numFirstMatrix * numSecondMatrix;
            }
        }
        return result;
    }

    //TODO: magic square
}
