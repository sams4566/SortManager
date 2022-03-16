package com.sparta.ss.sorters.bubblesort;

import com.sparta.ss.sorters.Algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort implements Algorithm {
    static void bubbleSort(int[] numbers) {
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
    }

    public int[] sortNumbers(int[] numbers) {
        bubbleSort(numbers);
//        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}
