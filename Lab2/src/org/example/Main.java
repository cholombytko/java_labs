package org.example;

public class Main {
    public static void main(String[] args) {
        MatrixClass matrix1 = new MatrixClass(2, 4);
        MatrixClass matrix2 = new MatrixClass(4, 2);
        byte[][] result = matrix1.operation(matrix2.getMatrix());
        double matrixAverage = matrix1.averageValue(result);
        matrix1.display(result);
        System.out.println("Average of each value = " + matrixAverage);
    }
}