package org.example;

public class Table {
    private int[][] matrix;

    public Table(int row_amount, int column_amount) {
        matrix = new int[row_amount][column_amount];
    }

    public int getValue(int row, int col) {
        return matrix[row][col];
    }

    public void setValue(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public int rows() {
        return matrix.length;
    }

    public int cols() {
        return matrix[0].length;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j];
                if (j < matrix[i].length - 1) {
                    result += " ";
                }
            }
            if (i < matrix.length - 1) {
                result += "\n";
            }
        }
        return result;
    }

    public double average() {
        long sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }
}