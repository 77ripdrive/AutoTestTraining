package arraysExc;

import java.util.*;

public class OrganizeElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeMatrix, rowMatrix;
        int[][] matrix, matrix1;

        System.out.println("Enter Matrix size: ");
        sizeMatrix = scanner.nextInt();
        matrix = fillMatrixRandom(sizeMatrix);
        printMatrix(matrix);
        System.out.println();

        System.out.println("Column sorting.Enter the column number: ");
        rowMatrix = scanner.nextInt();
        matrix1 = orderMatrixCols(matrix, rowMatrix);
        printMatrix(matrix1);
        System.out.println();

        System.out.println("Cyclic shift to the right position.Enter integer number--> k : ");
        rowMatrix = scanner.nextInt();
        matrix1 = cyclicMatrixMove(matrix, rowMatrix);
        System.out.println("Result matrix :");
        printMatrix(matrix1);
        System.out.println();

        System.out.println("Sum of elements between first and second positive elements in each row: ");
        sumBetweenTwoPositiveElementOfRow(matrix1);
    }

    private static void printMatrix(int[][] matrix) {

        for (int i = 0, n = matrix.length; i < n; i++) {
            for (int j = 0, m = matrix[i].length; j < m; j++) {
                System.out.print(matrix[i][j]+"  " );
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrixRandom(int sizeNumber) {
        if (sizeNumber <= 0) {
            throw new IllegalArgumentException();
        }
        int[][] matrix = new int[sizeNumber][sizeNumber];
        for (int i = 0; i < sizeNumber; i++) {
            for (int j = 0; j < sizeNumber; j++) {
                matrix[i][j] = (int) ( Math.random()*( sizeNumber *9 + 2 ) - ( sizeNumber + 1 ) );
            }
        }
        return matrix;
    }

    private static int[][] orderMatrixCols(int[][] matrix, int row) {

        int[][] tempMatrix = matrix.clone();
        for (int i = 0, matrixLength = matrix.length; i < matrixLength; i++) {
            for (int j = i + 1; j < matrixLength; j++) {
                if (tempMatrix[i][row - 1] > tempMatrix[j][row - 1]) {
                    tempMatrix = moveCols(tempMatrix, i, j);
                }
            }
        }
        return tempMatrix;
    }

    private static int[][] moveCols(int[][] matrix, int col1, int col2) {

        int tempMatrix[][] = matrix.clone();
        int t[] = tempMatrix[col1];
        tempMatrix[col1] = tempMatrix[col2];
        tempMatrix[col2] = t;
        return tempMatrix;
    }

    private static int[][] cyclicMatrixMove(int[][] matrix, int k) {

        int tempMatrix[][] = matrix.clone();
        for (int i = 0, matrixLength = matrix.length; i < matrixLength; i++) {
            tempMatrix[i] = cyclicRowMove(tempMatrix[i], k);
        }
        return tempMatrix;
    }

    private static int[] cyclicRowMove(int[] row, int k) {
        int rowLenght = row.length;
        int tempRow[] = new int[rowLenght];
        int n = ( k % rowLenght ) + rowLenght;
        for (int i = 0; i < rowLenght; i++) {
            tempRow[( i + n ) % rowLenght] = row[i];
        }
        return tempRow;
    }

    private static void sumBetweenTwoPositiveElementOfRow(int [][] matrix){
        int sum=0;
        boolean firstPositive = false;
        boolean secondPositive = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if ((matrix[i][j]>0) && (firstPositive))
                    secondPositive = true;
                else if ((firstPositive) && (!secondPositive)){
                     sum += matrix[i][j];
                }
                else if ((matrix[i][j]>0) && (!firstPositive)) {
                    firstPositive = true;
                }
            }
            System.out.println("The sum in row :  "+ i+ "  = " + sum);
            firstPositive = false;
            secondPositive = false;
            sum = 0;
        }


    }

}


