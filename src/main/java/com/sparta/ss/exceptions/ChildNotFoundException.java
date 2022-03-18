package com.sparta.ss.exceptions;

public class ChildNotFoundException extends Exception {
    public String getMessage() {
        return "Binary Tree: Element not found";
    }
}
