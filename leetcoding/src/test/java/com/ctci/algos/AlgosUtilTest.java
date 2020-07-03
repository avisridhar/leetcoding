package com.ctci.algos;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AlgosUtilTest {
    private AlgosUtil algosUtil;

    @Before
    public void setUp() {
        algosUtil = new AlgosUtil();
    }

    @Test
    public void binarySearchIntArr() {
        int[] arr = {3, 6, 8, 10};
        int val = 10;
        assertThat(algosUtil.binarySearchIntArr(arr, val)).isTrue();
        val = 5;
        assertThat(algosUtil.binarySearchIntArr(arr, val)).isFalse();
    }

    @Test
    public void binarySearchStrArr() {
        String[] strArr = {"a", "b", "c", "d"};
        String val = "b";
        assertThat(algosUtil.binarySearchStrArr(strArr, val)).isTrue();
        val = "f";
        assertThat(algosUtil.binarySearchStrArr(strArr, val)).isFalse();
    }
}