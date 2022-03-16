package com.sparta.ss.sorters.mergesort;

import com.sparta.ss.sorters.Algorithm;

import java.util.Arrays;

public class MergeSort implements Algorithm {
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
        return mergedArray(splitMergeSort(numbers1), splitMergeSort(numbers2));
    }

    public static int[] mergedArray(int[] numbers1, int[] numbers2) {
        int array1 = 0;
        int array2 = 0;
        int array3 = 0;
        int length1 = numbers1.length;
        int length2 = numbers2.length;
        int lengthlist = numbers1.length + numbers2.length;
        int[] list = new int[lengthlist];
        while (array3 < lengthlist) {
            if (array1 == length1) {
                list[array3] = numbers2[array2];
                array2++;
                array3++;
            } else if (array2 == length2) {
                list[array3] = numbers1[array1];
                array1++;
                array3++;
            } else {
                if (numbers1[array1] < numbers2[array2]) {
                    list[array3] = numbers1[array1];
                    array1++;
                    array3++;
                } else if (numbers1[array1] == numbers2[array2]) {
                    list[array3] = numbers1[array1];
                    array1++;
                    array3++;
                    list[array3] = numbers2[array2];
                    array2++;
                    array3++;
                } else {
                    list[array3] = numbers2[array2];
                    array2++;
                    array3++;
                }
            }
        }
        return list;
    }

    public int[] sortNumbers(int[] numbers) {
        System.out.println("Merge Sort");
        int[] sortedArray = splitMergeSort(numbers);
        return sortedArray;
    }
}
