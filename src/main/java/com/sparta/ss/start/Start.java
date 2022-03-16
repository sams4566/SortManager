package com.sparta.ss.start;

import com.sparta.ss.sorters.Algorithm;
import com.sparta.ss.sorters.bubblesort.BubbleSort;

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
        return new BubbleSort();
    }
}
