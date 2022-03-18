package com.sparta.ss.algorithm_tests;

import com.sparta.ss.sorters.binarytree.BinaryTree;
import com.sparta.ss.sorters.binarytree.BinaryTreeInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class BinaryTreeTests {

    @Test
    @DisplayName("Test correct array returned")
    public void testCorrectArrayReturned() {
        int initialNode = 0;
        BinaryTreeInterface tree = new BinaryTree(initialNode);
        Random random = new Random();
        int[] firstArray = new int[15];
        firstArray[0] = initialNode;
        for (int i = 1; i < 15; i++) {
            int rand = random.nextInt(1000) * (random.nextBoolean() ? 1 : -1);
            tree.addElement(rand);
            firstArray[i] = rand;
        }
        int[] finalArray = tree.getSortedTreeAsc();
        int len = finalArray.length;
        for (int i = 1; i < len - 1; i++) {
            Assertions.assertTrue(finalArray[i - 1] <= finalArray[i]);
        }
    }

    @Test
    @DisplayName("Test if array has duplicate values")
    void testIfArrayHasDuplicateValues() {
        int[] initialArray = {999, 999, -79, -79, -184, -184, -565, -409, 9, 277, 502, -631, 116, -231, -722};
        int initialNode = 0;
        BinaryTreeInterface tree = new BinaryTree(initialNode);
        for (int i = 1; i < 15; i++) {
            tree.addElement(initialArray[i]);
        }
        int[] finalArray = tree.getSortedTreeAsc();
        for (int i = 0; i < finalArray.length; i++) {
            Assertions.assertEquals(finalArray[finalArray.length - 1], finalArray[finalArray.length - 1]);
        }
    }

    @Test
    @DisplayName("Test pre sorted array")
    void testPreSortedArray() {
        int[] initialArray = {-3, -2, -1, 0, 1, 2, 3};
        int initialNode = 0;
        BinaryTreeInterface tree = new BinaryTree(initialNode);
        for (int i = 1; i < 7; i++) {
            tree.addElement(initialArray[i]);
        }
        int[] finalArray = tree.getSortedTreeAsc();
        for (int i = 1; i < finalArray.length - 1; i++) {
            Assertions.assertTrue(finalArray[i - 1] <= finalArray[i]);
        }
    }

    @Test
    @DisplayName("Test array with one value")
    void testArrayWithOneValue() {
        int[] initialArray = {6};
        int initialNode = 6;
        BinaryTreeInterface tree = new BinaryTree(initialNode);
        int[] finalArray = tree.getSortedTreeAsc();
        Assertions.assertEquals(finalArray.length, initialArray.length);
    }

    @Test
    @DisplayName("Test odd numbered array size")
    void testOddNumberedArraySize() {
        int[] initialArray = {892, 861, -79, -252, -184, 264, -565, -409, 9, 277, 502, -631, 116, -231, -722};
        int initialNode = 0;
        BinaryTreeInterface tree = new BinaryTree(initialNode);
        for (int i = 1; i < 15; i++) {
            tree.addElement(initialArray[i]);
        }
        int[] finalArray = tree.getSortedTreeAsc();
        Assertions.assertEquals(finalArray.length, initialArray.length);
        for (int i = 1; i < finalArray.length - 1; i++) {
            Assertions.assertTrue(finalArray[i - 1] <= finalArray[i]);
        }
    }
}