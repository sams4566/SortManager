package com.sparta.ss.mergesort;

import com.sparta.ss.sorters.Algorithm;
import com.sparta.ss.sorters.MergeSort;
import com.sparta.ss.start.Start;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Random;

import static com.sparta.ss.start.Start.chooseAlgorithm;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmTests {
    private static Algorithm algorithm;

    @BeforeAll
    public static void setAlgorithm() {
        algorithm = Start.chooseAlgorithm(6);
        System.out.println("Algorithm selected for testing");
    }

    @Test
    @DisplayName("Test correct array returned")
    public void testCorrectArrayReturned() {
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? -1 : 1);
        }
        int[] finalArray = algorithm.sortNumbers(numbers);
        int len = finalArray.length;
        for (int i = 1; i < len - 1; i++) {
            Assertions.assertTrue(finalArray[i-1] <= finalArray[i]);
        }
    }
}























