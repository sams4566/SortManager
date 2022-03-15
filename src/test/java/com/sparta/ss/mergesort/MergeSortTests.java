package com.sparta.ss.mergesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTests {
    @Test
    @DisplayName("Test correct array returned")
    void testCorrectArrayReturned() {
        int[] actual = {2,34,3,333,45,3,22,2};
        int[] expected = {2,2,3,3,22,34,45,333};
        int[] finalArray = SplitArray.splitMergeSort(actual);
        Assertions.assertEquals(Arrays.toString(finalArray), Arrays.toString(expected));
    }
}