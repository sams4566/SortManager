package com.sparta.ss.sorters.binarytree;

import com.sparta.ss.sorters.Algorithm;

import java.util.Random;

public class BinaryTreeMain implements Algorithm {
    public int[] sortNumbers(int[] numbers) {
        System.out.println("Binary Tree");
        int len = numbers.length;
        BinaryTree tree = new BinaryTree(0);
        Random random = new Random();
        for (int i = 0; i < len - 1; i++) {
            int rand = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
            tree.addElement(rand);
        }
        Node root = tree.rootNode;
        int[] order = new int[len];
        int[] list = tree.inOrder(root, order);
        return list;
    }
}
