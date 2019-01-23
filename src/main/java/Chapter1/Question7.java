package Chapter1;

import java.util.HashSet;
import java.util.Set;

public class Question7 {

    public static void zerofy(int[][] matrix) {
        Set<Integer> rowsToZerofy = new HashSet<>();
        Set<Integer> colsToZerofy = new HashSet<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0) {
                    rowsToZerofy.add(row);
                    colsToZerofy.add(col);
                }
            }
        }

        rowsToZerofy.forEach(row -> {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = 0;
            }
        });

        colsToZerofy.forEach(col -> {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = 0;
            }
        });
    }

    public static void main(String[] args) {
        int[][] m = {{1, 0, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 0}};

        System.out.println(matrixToString(m));
        zerofy(m);
        System.out.println("\n" + matrixToString(m));
    }

    public static String matrixToString(int[][] matrix) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int row = 0; row < matrix.length; row++) {
            if (!stringBuffer.toString().equals("")) {
                stringBuffer.append("\n");
            }
            stringBuffer.append("{");
            for (int col = 0; col < matrix[row].length; col++) {
                stringBuffer.append(Integer.toString(matrix[row][col]));
                if (col != matrix[row].length - 1) {
                    stringBuffer.append(", ");
                }
            }
            stringBuffer.append("}");
        }

        return stringBuffer.toString();
    }
}
