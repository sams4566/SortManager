package com.sparta.ss.sorters;

import com.sparta.ss.sorters.Algorithm;

public class BubbleSort implements Algorithm {
    static int[] bubbleSort(int[] numbers) {
        int len = numbers.length;
        int a = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    a = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = a;
                }
            }
        }
        return numbers;
    }

    public int[] sortNumbers(int[] numbers) {
        int[] finalArray = bubbleSort(numbers);
        return finalArray;
    }
}
