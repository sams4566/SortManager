package com.sparta.ss.insertionsort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scanned = sc.nextInt();
        int[] numbers = new int[scanned];
        Random random = new Random();
        for (int i = 0; i < scanned; i++) {
            numbers[i] = random.nextInt(1000) * (random.nextBoolean() ? -1 : 1);
        }
        System.out.println(Arrays.toString(numbers));
        int[] finalArray = InsertionSort.sortArray(numbers);
        System.out.println(Arrays.toString(finalArray));
    }
}
