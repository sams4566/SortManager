package com.sparta.ss.start;

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
        System.out.println("Select an algoritm number (1 - 6):");
        Scanner sorter = new Scanner(System.in);
        int chosenSorter = sorter.nextInt();

        Algorithm algorithm = chooseAlgorithm(chosenSorter);
        System.out.println("Select the length of the array");
        Scanner sc = new Scanner(System.in);
        int scanned = sc.nextInt();
        int[] numbers = new int[scanned];
        Random random = new Random();
        for (int i = 0; i < scanned; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? -1 : 1);
        }
        System.out.println(Arrays.toString(numbers));
        long timeStart = System.nanoTime();
        int[] finalArray = algorithm.sortNumbers(numbers);
        System.out.println(Arrays.toString(finalArray));
        long timeEnd = System.nanoTime();
        System.out.println("Algorithm time: " + (timeEnd - timeStart) + " nanoseconds");
    }

    public static Algorithm chooseAlgorithm(int chosenSorter) {
        switch (chosenSorter) {
            case 1:
                return new BubbleSort();
            case 2:
                return new SelectionSort();
            case 3:
                return new QuickSort();
            case 4:
                return new MergeSort();
            case 5:
                return new BinaryTreeMain();
            default:
                return new InsertionSort();
        }
    }
}
