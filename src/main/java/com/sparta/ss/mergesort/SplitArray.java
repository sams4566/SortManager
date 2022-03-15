package com.sparta.ss.mergesort;

public class SplitArray {
    public static int[] splitMergeSort(int[] numbers) {
        int[] numbers1 = new int[numbers.length/2];
        int[] numbers2 = new int[numbers.length - numbers.length/2];
        if (numbers.length == 1) {
            return numbers;
        } else {
            for (int i = 0; i < numbers.length/2; i++) {
                numbers1[i] = numbers[i];
            }
            for (int i = numbers.length/2; i < numbers.length; i++) {
                numbers2[i - numbers.length/2] = numbers[i];
            }
        }
        return MergeArrays.mergedArray(splitMergeSort(numbers1), splitMergeSort(numbers2));
    }
}
