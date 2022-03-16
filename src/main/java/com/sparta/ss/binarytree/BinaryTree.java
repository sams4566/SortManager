package com.sparta.ss.binarytree;

public class BinaryTree {
    public final Node rootNode;
    public static int counter = 0;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                Node leftChild = new Node(element);
                node.setLeftChild(leftChild);
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                Node rightChild = new Node(element);
                node.setRightChild(rightChild);
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    public boolean findElement(final int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

    private Node findNode(int element) {
        Node node = rootNode;
        while(node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    public static int[] inOrder(Node node, int[] order) {
        if (node == null) {
            return null;
        }
        inOrder(node.getLeftChild(), order);
        order[counter] = node.getValue();
        counter++;
        inOrder(node.getRightChild(), order);
        return order;
    }
}
