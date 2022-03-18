package com.sparta.ss.mergesort;

import com.sparta.ss.sorters.Algorithm;
import com.sparta.ss.start.Start;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortTests {
    private static Algorithm algorithm;

    @BeforeAll
    public static void setAlgorithm() {
        algorithm = Start.chooseAlgorithm(3);
        System.out.println("Algorithm selected for testing");
    }

    @Test
    @DisplayName("Test correct array returned")
    public void testCorrectArrayReturned() {
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
        }
        int[] finalArray = algorithm.sortNumbers(numbers);
        int len = finalArray.length;
        for (int i = 1; i < len - 1; i++) {
            Assertions.assertTrue(finalArray[i - 1] <= finalArray[i]);
        }
    }

    @Test
    @DisplayName("Test if array has duplicate values")
    void testIfArrayHasDuplicateValues() {
        int[] initialArray = {999, 999, -79, -79, -184, -184, -565, -409, 9, 277, 502, -631, 116, -231, -722};
        int[] finalArray = algorithm.sortNumbers(initialArray);
        for (int i = 1; i < finalArray.length - 1; i++) {
            Assertions.assertTrue(finalArray[finalArray.length - 2] == finalArray[finalArray.length - 1]);
        }
    }

    @Test
    @DisplayName("Test pre sorted array")
    void testPreSortedArray() {
        int[] initialArray = {-3, -2, -1, 0, 1, 2, 3};
        int[] finalArray = algorithm.sortNumbers(initialArray);
        for (int i = 1; i < finalArray.length - 1; i++) {
            Assertions.assertTrue(finalArray[i - 1] <= finalArray[i]);
        }
    }

    @Test
    @DisplayName("Test array with one value")
    void testArrayWithOneValue() {
        int[] initialArray = {6};
        int[] finalArray = algorithm.sortNumbers(initialArray);
        Assertions.assertEquals(finalArray.length, initialArray.length);
    }

    @Test
    @DisplayName("Test odd numbered array size")
    void testOddNumberedArraySize() {
        int[] initialArray = {892, 861, -79, -252, -184, 264, -565, -409, 9, 277, 502, -631, 116, -231, -722};
        int[] finalArray = algorithm.sortNumbers(initialArray);
        assertEquals(finalArray.length, initialArray.length);
        for (int i = 1; i < finalArray.length - 1; i++) {
            Assertions.assertTrue(finalArray[i - 1] <= finalArray[i]);
        }
    }
}
