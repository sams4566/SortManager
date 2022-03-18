package com.sparta.ss.algorithm_tests;

import com.sparta.ss.sorters.*;
import com.sparta.ss.sorters.binarytree.BinaryTree;
import com.sparta.ss.sorters.binarytree.BinaryTreeInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class PerformanceTests {

    @Test
    @DisplayName("Test Binary Tree Sort")
    void testBinaryTreeSort() {
        System.out.println("Binary Tree Sort algorithm:");
        int initialNode = 0;
        BinaryTreeInterface tree = new BinaryTree(initialNode);
        Random random = new Random();
        int[] firstArray = new int[15];
        firstArray[0] = initialNode;
        for (int i = 1; i < 15; i++) {
            int rand = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
            tree.addElement(rand);
            firstArray[i] = rand;
        }
        System.out.println(Arrays.toString(firstArray));
        long timeStart = System.nanoTime();
        int[] finalArray = tree.getSortedTreeAsc();
        long timeEnd = System.nanoTime();
        System.out.println(Arrays.toString(finalArray));
        System.out.println("Binary Tree Sort time: " + (timeEnd - timeStart) + " nanoseconds");
        System.out.println("------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test Bubble Sort")
    void testBubbleSort() {
        System.out.println("Bubble Sort algorithm:");
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
        }
        System.out.println(Arrays.toString(numbers));
        Algorithm algorithm = new BubbleSort();
        long timeStart = System.nanoTime();
        int[] finalArray = algorithm.sortNumbers(numbers);
        long timeEnd = System.nanoTime();
        System.out.println(Arrays.toString(finalArray));
        System.out.println("Bubble Sort time: " + (timeEnd - timeStart) + " nanoseconds");
        System.out.println("------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test Insertion Sort")
    void testInsertionSort() {
        System.out.println("Insertion Sort algorithm:");
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
        }
        System.out.println(Arrays.toString(numbers));
        Algorithm algorithm = new InsertionSort();
        long timeStart = System.nanoTime();
        int[] finalArray = algorithm.sortNumbers(numbers);
        long timeEnd = System.nanoTime();
        System.out.println(Arrays.toString(finalArray));
        System.out.println("Insertion Sort time: " + (timeEnd - timeStart) + " nanoseconds");
        System.out.println("------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test Merge Sort")
    void testMergeSort() {
        System.out.println("Merge Sort algorithm:");
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
        }
        System.out.println(Arrays.toString(numbers));
        Algorithm algorithm = new MergeSort();
        long timeStart = System.nanoTime();
        int[] finalArray = algorithm.sortNumbers(numbers);
        long timeEnd = System.nanoTime();
        System.out.println(Arrays.toString(finalArray));
        System.out.println("Merge Sort time: " + (timeEnd - timeStart) + " nanoseconds");
        System.out.println("------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test Quick Sort")
    void testQuickSort() {
        System.out.println("Quick Sort algorithm:");
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
        }
        System.out.println(Arrays.toString(numbers));
        Algorithm algorithm = new QuickSort();
        long timeStart = System.nanoTime();
        int[] finalArray = algorithm.sortNumbers(numbers);
        long timeEnd = System.nanoTime();
        System.out.println(Arrays.toString(finalArray));
        System.out.println("Quick Sort time: " + (timeEnd - timeStart) + " nanoseconds");
        System.out.println("------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test Selection Sort")
    void testSelectionSort() {
        System.out.println("Selection Sort algorithm:");
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
        }
        System.out.println(Arrays.toString(numbers));
        Algorithm algorithm = new SelectionSort();
        long timeStart = System.nanoTime();
        int[] finalArray = algorithm.sortNumbers(numbers);
        long timeEnd = System.nanoTime();
        System.out.println(Arrays.toString(finalArray));
        System.out.println("Selection Sort time: " + (timeEnd - timeStart) + " nanoseconds");
        System.out.println("------------------------------------------------------------");
    }
}
