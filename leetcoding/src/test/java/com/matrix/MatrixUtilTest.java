package com.matrix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixUtilTest {
    private MatrixUtil matrixUtil;

    @Before
    public void setUp() {
        matrixUtil = new MatrixUtil();
    }

    @Test
    public void printMatrix() {
        int table[][] = new int[3][4];
        // row 0
        table[0][0] = 2;
        table[0][1] = 4;
        table[0][2] = 8;
        table[0][3] = 4;
// row 1
        table[1][0] = 12;
        table[1][1] = 14;
        table[1][2] = 18;
        table[1][3] = 14;
// row 2
        table[2][0] = -2;
        table[2][1] = 6;
        table[2][2] = 8;
        table[2][3] = 10;
        matrixUtil.printMatrix(table);
    }
}