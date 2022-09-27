package org.example;

public final class Formula {

    //Lazy Singleton implementation
    private Formula() {
    }

    public static final Formula INSTANCE = new Formula();

    private int formulaCalc(int a, int b, int c) {
        return (a + b) / (a + c);
    }

    private void invalidValuesException(int a, int n, int c) {
        if (a <= -c && -c <= n) {
            throw new IllegalArgumentException("Invalid values");
        }
    }

    private int innerRowCount(int i, int b, int m, int c) {
        int total = 0;
        for (short j = (short) b; j <= m; j++) {
            total += formulaCalc(i, j, c);
        }
        return total;
    }

    public int totalCalc(int a, int b, int n, int m, int c) {
        invalidValuesException(a, n, c);
        int total = 0;
        for (short i = (short) a; i <= n; i++) {
            total += innerRowCount(i, b, m, c);
        }
        return total;
    }
}
