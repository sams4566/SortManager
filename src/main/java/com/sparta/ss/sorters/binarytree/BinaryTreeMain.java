package com.sparta.ss.sorters.binarytree;

import com.sparta.ss.sorters.Algorithm;

import java.util.Random;
import java.util.Scanner;

public class BinaryTreeMain implements Algorithm {
    public int[] sortNumbers(int[] numbers) {
        System.out.println("Binary Tree");
        int len = numbers.length;
        System.out.println("Select the root node");
        Scanner firstNode = new Scanner(System.in);
        int initialNode = firstNode.nextInt();
        BinaryTreeInterface tree = new BinaryTree(initialNode);
        Random random = new Random();
        for (int i = 0; i < len - 1; i++) {
            int rand = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
            tree.addElement(rand);
        }
//        BinaryTree.Node root = tree.rootNode;
//        int[] order = new int[len];
        int[] list = tree.getSortedTreeAsc();
        return list;
    }
}
