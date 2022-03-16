package com.sparta.ss.start;

import com.sparta.ss.sorters.Algorithm;
import com.sparta.ss.sorters.binarytree.BinaryTreeMain;
import com.sparta.ss.sorters.bubblesort.BubbleSort;
import com.sparta.ss.sorters.insertionsort.InsertionSort;
import com.sparta.ss.sorters.mergesort.MergeSort;
import com.sparta.ss.sorters.quicksort.QuickSort;
import com.sparta.ss.sorters.selectionsort.SelectionSort;

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
        int[] finalArray = algorithm.sortNumbers(numbers);
        System.out.println(Arrays.toString(finalArray));
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
