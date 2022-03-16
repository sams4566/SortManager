package com.sparta.ss.quicksort;

public class QuickSort {
    public static int[] quickSortArray(int[] numbers, int min, int max) {
        if (min < max) {
            int pivot = splitArray(numbers, min, max);
            quickSortArray(numbers, min, pivot - 1);
            quickSortArray(numbers, pivot + 1, max);
        }
        return numbers;
    }

    public static int splitArray(int[] numbers, int min, int max) {
        int pivot = numbers[max];
        int k = min - 1;
        for (int i = min; i < max; i++) {
            if (numbers[i] < pivot) {
                k++;
                int a = numbers[k];
                numbers[k] = numbers[i];
                numbers[i] = a;
            }
        }
        int x = numbers[max];
        numbers[max] = numbers[k + 1];
        numbers[k + 1] = x;
        return (k + 1);
    }
}
