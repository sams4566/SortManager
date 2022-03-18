package com.sparta.ss.sorters.binarytree;

import com.sparta.ss.sorters.Algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinaryTreeMain implements Algorithm {
    public int[] sortNumbers(int[] numbers) {
        int len = numbers.length;
        System.out.println("Select the root node");
        Scanner firstNode = new Scanner(System.in);
        int initialNode = firstNode.nextInt();
        BinaryTreeInterface tree = new BinaryTree(initialNode);
        Random random = new Random();
        int[] firstArray = new int[len];
        firstArray[0] = initialNode;
        for (int i = 1; i < len; i++) {
            int rand = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
            tree.addElement(rand);
            firstArray[i] = rand;
        }
        System.out.println("Binary Tree Sort");
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(firstArray));
        int[] list = tree.getSortedTreeAsc();
        return list;
    }
}
