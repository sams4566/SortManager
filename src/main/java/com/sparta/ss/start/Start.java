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
        int chosenSorter = initialPrint();
        Algorithm algorithm = null;
        try {
            algorithm = chooseAlgorithm(chosenSorter);
            int[] firstArray = makeArray();
            if (chosenSorter != 1) {
                printAlgorithm(firstArray, chosenSorter);
            }
            long timeStart = System.nanoTime();
            int[] finalArray = algorithm.sortNumbers(firstArray);
            long timeEnd = System.nanoTime();
            finalprint(finalArray, timeEnd, timeStart);
        } catch (SwitchStatementException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int initialPrint() {
        System.out.println("Select an algorithm number (1 - 6):");
        System.out.println("1. Binary Tree Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Selection Sort");
        Scanner sorter = new Scanner(System.in);
        int number = sorter.nextInt();
        return number;
    }

    public static void printAlgorithm(int[] firstArray, int chosenSorter) {
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
        System.out.println(Arrays.toString(firstArray));
    }

    public static void finalprint(int[] finalArray, long timeEnd, long timeStart) {
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(finalArray));
        System.out.println("Algorithm time: " + (timeEnd - timeStart) + " nanoseconds");
    }

    public static int[] makeArray() {
        System.out.println("Select the length of the array");
        Scanner sc = new Scanner(System.in);
        int scanned = sc.nextInt();
        int[] numbers = new int[scanned];
        Random random = new Random();
        for (int i = 0; i < scanned; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
        }
        return numbers;
    }

    public static Algorithm chooseAlgorithm(int chosenSorter) throws SwitchStatementException {
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
            case 6:
                return new SelectionSort();
            default:
                throw new SwitchStatementException("Invalid entry: " + chosenSorter + " (Please choose between 1 - 6)");
        }
    }
}
