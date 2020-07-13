package com.ctci.ds.trees;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreesUtilTest {

    @Before
    public void setUp() {
    }

    @Test
    public void inorderTraversal() {
        /* creating a binary tree and entering
        the nodes */
        BinaryTree root = new BinaryTree();
        root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        //inorder();
    }
}