package com.sparta.ss.sorters.binarytree;

import com.sparta.ss.exceptions.ChildNotFoundException;

public class BinaryTree implements BinaryTreeInterface {
    private final Node rootNode;
    private static int counter = 0;
    private static int numOfNodes = 0;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    public void addElement(final int element) {
        numOfNodes++;
        addNodeToTree(rootNode, element);
    }

    public int getRootElement(){
        int root = rootNode.getValue();
        return root;
    }

    public int getNumberOfElements() {
        return numOfNodes;
    }

    public void addElements(final int[] elements){}

    public void addNodeToTree(Node node, int element) {

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

    public int[] getSortedTreeAsc() {
        int[] order = new int[numOfNodes + 1];
        inOrderAsc(rootNode, order);
        return order;
    }

    public static int[] inOrderAsc(Node node, int[] order) {
        if (node == null) {
            return null;
        }
        inOrderAsc(node.getLeftChild(), order);
        order[counter] = node.getValue();
        counter++;
        inOrderAsc(node.getRightChild(), order);
        return order;
    }

    public int[] getSortedTreeDesc() {
        int[] order = new int[numOfNodes + 1];
        inOrderDesc(rootNode, order);
        return order;
    }

    public static int[] inOrderDesc(Node node, int[] order) {
        if (node == null) {
            return null;
        }
        inOrderDesc(node.getLeftChild(), order);
        order[numOfNodes - counter] = node.getValue();
        counter++;
        inOrderDesc(node.getRightChild(), order);
        return order;
    }

    public int getLeftChild(int element) throws ChildNotFoundException {
        return element;
    }

    public int getRightChild(int element) throws ChildNotFoundException {
        return element;
    }

    public static class Node {

        private final int value;
        Node leftChild;
        Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {
            if (leftChild == null) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isRightChildEmpty() {
            if (rightChild == null) {
                return true;
            } else {
                return false;
            }
        }
    }
}
