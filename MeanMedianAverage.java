package statistics;

import java.util.Arrays;

public class MeanMedianAverage {

    // Mean / Average
    public static double mean(int[] numbers) {
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        return (double) sum / numbers.length;
    }

    // Median
    public static double median(int[] numbers) {
        int[] sorted = numbers.clone();
        Arrays.sort(sorted);

        int n = sorted.length;

        if (n % 2 == 0) {
            return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
        } else {
            return sorted[n / 2];
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Mean: " + mean(numbers));
        System.out.println("Average: " + mean(numbers));
        System.out.println("Median: " + median(numbers));
    }
}