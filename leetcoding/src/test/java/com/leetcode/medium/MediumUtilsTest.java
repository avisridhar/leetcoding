package com.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MediumUtilsTest {
    private MediumUtils mediumUtils;

    @Before
    public void setUp() {
        mediumUtils = new MediumUtils();
    }

    @Test
    public void longestPalindromeSubstring() {
        assertThat(mediumUtils.longestPalindromeSubstring("bananas")).isEqualTo(5);
    }
}