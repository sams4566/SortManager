package com.sparta.ss.start;

import com.sparta.ss.exceptions.SwitchStatementException;
import com.sparta.ss.sorters.Algorithm;
import com.sparta.ss.sorters.binarytree.BinaryTreeMain;
import com.sparta.ss.sorters.BubbleSort;
import com.sparta.ss.sorters.InsertionSort;
import com.sparta.ss.sorters.MergeSort;
import com.sparta.ss.sorters.QuickSort;
import com.sparta.ss.sorters.SelectionSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Start {
    public static void main(String[] args) {
        System.out.println("Select an algorithm number (1 - 6):");
        System.out.println("1. Binary Tree Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Selection Sort");
        Scanner sorter = new Scanner(System.in);
        int chosenSorter = sorter.nextInt();

        Algorithm algorithm = chooseAlgorithm(chosenSorter);
        System.out.println("Select the length of the array");
        Scanner sc = new Scanner(System.in);
        int scanned = sc.nextInt();
        int[] numbers = new int[scanned];
        Random random = new Random();
        for (int i = 0; i < scanned; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
        }
        if (chosenSorter != 1) {
            if (chosenSorter == 2) {
                System.out.println("Bubble Sort");
            } else if (chosenSorter == 3) {
                System.out.println("Insertion Sort");
            } else if (chosenSorter == 4) {
                System.out.println("Merge Sort");
            } else if (chosenSorter == 5) {
                System.out.println("Quick Sort");
            } else {
                System.out.println("Selection Sort");
            }
            System.out.println("Before Sorting:");
            System.out.println(Arrays.toString(numbers));
        }
        long timeStart = System.nanoTime();
        int[] finalArray = algorithm.sortNumbers(numbers);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(finalArray));
        long timeEnd = System.nanoTime();
        System.out.println("Algorithm time: " + (timeEnd - timeStart) + " nanoseconds");
    }

    public static Algorithm chooseAlgorithm(int chosenSorter) {
        switch (chosenSorter) {
            case 1:
                return new BinaryTreeMain();
            case 2:
                return new BubbleSort();
            case 3:
                return new InsertionSort();
            case 4:
                return new MergeSort();
            case 5:
                return new QuickSort();
            default:
                return new SelectionSort();
        }
    }
}
