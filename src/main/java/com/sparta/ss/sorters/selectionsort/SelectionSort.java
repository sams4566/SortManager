package com.sparta.ss.sorters.selectionsort;

import com.sparta.ss.sorters.Algorithm;

public class SelectionSort implements Algorithm {
    public static int[] selectionSortArray(int[] numbers, int max) {
        for (int i = 0; i < max - 1; i++) {
            int index = i;
            for (int j = i + 1; j < max; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }
            int num = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = num;
        }
        return numbers;
    }

    public int[] sortNumbers(int[] numbers) {
        System.out.println("Selection Sort");
        int len = numbers.length;
        selectionSortArray(numbers, len);
        return numbers;
    }
}
