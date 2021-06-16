package Chapter_Seven;


import java.util.Arrays;

public class fibonacciSeries {

    public static void main(String[] args) {

        int result = fibonacci(10);
        System.out.println(result);
    }
    public static int fibonacci(int n) {
        int[] fibSeries = new int[n];
        Arrays.fill(fibSeries,0);
        fibSeries[1] = 1;
        for (int x = 2; x < n; x++) {
            fibSeries[x] = fibSeries[x - 1] + fibSeries[x - 2];
        }
        return fibSeries[n - 1];
    }
}

