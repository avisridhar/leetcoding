package com.matrix;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixUtilTest {
    private MatrixUtil matrixUtil;

    @Before
    public void setUp() {
        matrixUtil = new MatrixUtil();
    }

    @Test
    public void printMatrix() {
        int arr[] = new int[] {1, 2, 3};
        /*int table[][] = {
                {2, 4, 8, 4},
                {12, 14, 18, 14},
                {-2, 6, 8, 10}
                };*/
        int table[][] = new int [][]{
            {2, 4, 8},
            {12, 14, 18},
            {-2, 6, 8}
        };
        matrixUtil.printMatrix(table);
    }

    /**
     * Absolute diagonal difference
     */
    @Test
    public void testAbsoluteDiagonalDifference() {
        int table[][] = new int [][]{
                {2, 4, 8},
                {12, 14, 18},
                {-2, 6, 8}
        };
        assertThat(matrixUtil.diagonalSum(table)).isEqualTo(44);

    }
}