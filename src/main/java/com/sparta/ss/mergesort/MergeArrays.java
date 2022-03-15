package com.sparta.ss.mergesort;

public class MergeArrays {
    static int[] mergedArray(int[] numbers1, int[] numbers2) {
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
}
