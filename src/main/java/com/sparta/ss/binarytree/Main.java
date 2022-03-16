package com.sparta.ss.binarytree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scanned = sc.nextInt();
        BinaryTree tree = new BinaryTree(500);
        Random random = new Random();
        for (int i = 0; i < scanned - 1; i++) {
            int rand = random.nextInt(1000);
            tree.addElement(rand);
        }
        Node root = tree.rootNode;
        int[] order = new int[scanned];
        int[] list = tree.inOrder(root, order);
        System.out.println(Arrays.toString(list));
    }
}
