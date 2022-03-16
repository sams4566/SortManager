package com.sparta.ss.sorters.insertionsort;

import com.sparta.ss.sorters.Algorithm;

public class InsertionSort implements Algorithm {
    public static int[] sortArray(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int k = i - 1;
            int sortInt = numbers[i];
            while (k >= 0 && numbers[k] > sortInt) {
                numbers[k + 1] = numbers[k];
                k = k - 1;
            }
            numbers[k + 1] = sortInt;
        }
        return numbers;
    }

    public int[] sortNumbers(int[] numbers) {
        System.out.println("Insertion Sort");
        sortArray(numbers);
        return numbers;
    }
}
