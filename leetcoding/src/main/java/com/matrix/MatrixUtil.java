package com.matrix;

public class MatrixUtil {

    /**
     * int[3][3] A
     * what does A.length mean
     * A.length = 3 ; number of rows
     * A[0].length = 3 ; number of columns on row 0
     1 <= A.length <= 1000 ; matrix rows are between 1 and 1000
     1 <= A[0].length <= 1000 ; matrix no. of columns on row 0 are between 1 and 1000
     */

    /**
     * Basic mxn matrix operations
     */

    void printMatrix(int table[][]) {

        System.out.println(table);

            for(int row = 0 ; row < table.length ; row++) { // iterate on row
                for(int col = 0 ; col < table[0].length ; col++) { // iterate on column
                    System.out.print(table[row][col] + " ");
                }
                System.out.println("\n");
            }

    }

    /**
     * Absolute diagonal difference
     */
    int diagonalSum(int matrix[][]) {
        int psum = 0;
        int ssum = 0;
        for(int row = 0 ; row < matrix.length ; row++)
            for (int col = 0; col < matrix[0].length; col++) {
                if (row == col) { // primary diagonal condition
                    psum += matrix[row][col];
                } else if ((row+col) == (matrix.length - 1)) { // secondary diagonal condition
                    ssum += matrix[row][col];
                }
            }

        return psum+ssum;
    }

    /**
     * Maximum path sum in matrix
     */

    /**
     * Max Sum Path in matrix
     * Dynamic Programming , recursion
     */

    /**
     * Matrix Transpose
     */



    /** LC medium
     *
     * You are given an n x n 2D matrix representing an image.
     *
     * Rotate the image by 90 degrees (clockwise).
     *
     * Note:
     *
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
     * DO NOT allocate another 2D matrix and do the rotation.
     *
     * Example 1:
     *
     * Given input matrix =
     * [
     *   [1,2,3],
     *   [4,5,6],
     *   [7,8,9]
     * ],
     *
     * rotate the input matrix in-place such that it becomes:
     * [
     *   [7,4,1],
     *   [8,5,2],
     *   [9,6,3]
     * ]
     *
     * Example 2:
     *
     * Given input matrix =
     * [
     *   [ 5, 1, 9,11],
     *   [ 2, 4, 8,10],
     *   [13, 3, 6, 7],
     *   [15,14,12,16]
     * ],
     *
     * rotate the input matrix in-place such that it becomes:
     * [
     *   [15,13, 2, 5],
     *   [14, 3, 4, 1],
     *   [12, 6, 8, 9],
     *   [16, 7,10,11]
     * ]
     *
     */

    /**
     * Zero Matrix
     * Write an algorithm such that if an element in a MxN matrix is 0,
     * its entire row and column are set to 0
     */

    /**
     Given a 2D array with values such as ‘S’, ‘D’, ‘1’ and ‘0’.
     - S is the Source
     - D is the Destination
     - 1 marks the valid path
     - 0 marks the obstacle
     Find the shortest distance from S to D avoiding all the obstacles.

     Input
     {
     {'S', '0', '1', '1'},
     {'1', '1', '0', '1'},
     {'0', '1', '1', '1'},
     {'1', '0', 'D', '1'}
     };
     */
    public int shortestDistance(char[][] matrix) {
        return 0;
    }

    /**
     * LC 'Medium' https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
     * Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
     *
     * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
     *
     * matrix = [
     *    [ 1,  5,  9],
     *    [10, 11, 13],
     *    [12, 13, 15]
     * ],
     * k = 8,
     *
     * return 13.
     */
    public int kthSmallest(int[][] matrix, int k) {

        return -1;

    }

}
