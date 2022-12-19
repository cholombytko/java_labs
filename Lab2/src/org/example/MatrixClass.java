package org.example;

import java.util.Random;

public class MatrixClass {

    private final byte[][] m;
    private final int rows;
    private final int cols;

    public MatrixClass(int rows, int cols) {
        this.m = new byte[rows][cols];
        this.rows = rows;
        this.cols = cols;
        generateRandomMatrixValues();
    }

    public byte[][] getMatrix() {
        return m;
    }
    private void generateRandomMatrixValues() {
        Random r = new Random();
        for(byte i = 0; i < this.rows; i++) {
            for (byte j = 0; j < this.cols; j++) {
                this.m[i][j] = (byte) r.nextInt(20);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void display(byte[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public double averageValue(byte[][] matrix) {
        int sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int quantity = rows * cols;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        double avg = sum / quantity;
        return avg;
    }
    public byte[][] operation(byte[][] matrix) {
        int rows, cols;
        if(this.m.length <= matrix.length) {
            rows=this.m.length;
        } else {
            rows=matrix.length;
        }
        if(this.m[0].length <= matrix[0].length) {
            cols=this.m[0].length;
        } else {
            cols=matrix[0].length;
        }
        byte[][] res = new byte[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                res[i][j] = (byte) (this.m[i][j] ^ matrix[i][j]);
            }
        }
        return res;
    }

}
