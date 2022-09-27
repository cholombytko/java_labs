package org.example;

public class Main {

    public static void main(String[] args) {
        int c = 2;
        int result = Formula.INSTANCE.totalCalc(1, 1, 4, 5, c);
        System.out.println(result);
    }
}