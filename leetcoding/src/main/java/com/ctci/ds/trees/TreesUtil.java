package com.ctci.ds.trees;
import java.util.List;


/**
 * Implementations of DFS BFS recursive and iterative
 */

class BinaryTree {
    int val;
    BinaryTree left;
    BinaryTree right;
    BinaryTree() {}
    BinaryTree(int val) {this.val = val;}
    BinaryTree(int val, BinaryTree left, BinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class TreesUtil {
    /**
     * Inorder tree traversal of Binary Tree
     * recursion ; iterative
     */
    /**
     * e.g., https://leetcode.com/problems/binary-tree-inorder-traversal/
     * Given a binary tree, return the inorder traversal of its nodes' values.
     *
     * Example:
     *
     * Input: [1,null,2,3]
     *    1
     *     \
     *      2
     *     /
     *    3
     *
     * Output: [1,3,2]
     *
     * Follow up: Recursive solution is trivial, could you do it iteratively?
     */

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    public List<Integer> inorderTraversal(BinaryTree root) {


        return null;

    }



    /**
     * Lowest Common Ancestor (LCA) of Binary Tree
     * recursion ; iterative
     */

    /**
     * print tree in ZigZag order
     * Given a tree
     *              1
     *        2          3
     *     4    5     6     7
     *   8  9 10 11 12 13 14 15
     *
     *  Print 1,3,2,4,5,6,7, 15,14,13...8
     *  Make sure code is testable
     *
     */


    /**
     * Trees And Graphs
     */

}
